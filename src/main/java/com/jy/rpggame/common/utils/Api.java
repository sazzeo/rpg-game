package com.jy.rpggame.common.utils;


import com.jy.rpggame.common.annotation.Controller;
import com.jy.rpggame.common.annotation.RequestMapping;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
public class Api {

    private static Api api;
    Set<Class> controllerClasses;

    Map<String, ControllerPath> controllers;
    ComponentScanner componentScanner = ComponentScanner.getInstance();

    private Api() {
        this.controllerClasses = componentScanner.findAllClassesUsingClassLoader("com.jy.rpggame.controller");
        this.controllers = new HashMap<>();

    }

    public static Api getInstance() {
        if (api == null) {
            api = new Api();
        }
        return api;
    }

    public void get() {
        for (Class clazz : controllerClasses) {
            if (clazz.getAnnotation(Controller.class) != null) {
                if (clazz.getAnnotation(RequestMapping.class) != null) {
                    RequestMapping requestMapping = (RequestMapping) clazz.getAnnotation(RequestMapping.class);

                    ControllerPath controllerPath = new ControllerPath();
                    controllerPath.setController(clazz);

                    String path = requestMapping.value();
                    controllerPath.setPath(path);

                    Method[] methods = clazz.getMethods();
                    for (Method method : methods) {
                        if (method.getAnnotation(RequestMapping.class) != null) {
                            RequestMapping methodRequestMapping = (RequestMapping) method.getAnnotation(RequestMapping.class);
                            controllerPath.addMethod(method);
                            controllerPath.addMethodName(methodRequestMapping.value());
                        }
                    }

                    this.controllers.put(path , controllerPath );
                }
            }
        }

    }



    public static void main(String[] args) {
        Api api = Api.getInstance();
        api.get();

        System.out.println(   api.getControllers());


    }

}
