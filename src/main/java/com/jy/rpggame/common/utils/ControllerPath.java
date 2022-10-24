package com.jy.rpggame.common.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class ControllerPath {

    private Class<?> Controller;
    private String path;
    private List<Method> methods;
    private List<String> methodsName;

    public ControllerPath() {
        this.methods = new ArrayList<>();
        this.methodsName = new ArrayList<>();
    }

    public void addMethod(Method method) {
        methods.add(method);
    }

    public void addMethodName(String methodName) {
        methodsName.add(methodName);
    }
}
