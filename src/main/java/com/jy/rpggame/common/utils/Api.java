package com.jy.rpggame.common.utils;


import com.jy.rpggame.common.annotation.Controller;
import com.jy.rpggame.common.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

public class Api {

    private static Api api;
    Set<Class> controllers;
    ComponentScanner componentScanner = ComponentScanner.getInstance();

    private Api() {
        this.controllers = componentScanner.findAllClassesUsingClassLoader("com.jy.rpggame.controller");

    }

    public static Api getInstance() {
        if (api == null) {
            api = new Api();
        }
        return api;
    }

    public void get() {
        for (Class clazz : controllers) {
            if (clazz.getAnnotation(Controller.class) != null) {
                if (clazz.getAnnotation(RequestMapping.class) != null) {
                    RequestMapping requestMapping = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
                    String mapping = requestMapping.value();

                    System.out.println(mapping);
                }
            }
        }

    }

    public static void main(String[] args) {
        Api.getInstance().get();
    }

}
