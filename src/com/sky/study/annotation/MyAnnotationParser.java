package com.sky.study.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 3 解析注解
 *
 * @author Sky
 * @Date 2019-01-10 14:25.
 */
public class MyAnnotationParser {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = UserMyAnnotation.class;
        Method method = clazz.getMethod("printMyAnnotation", String.class);
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("name=" + annotation.name() + ", value=" + annotation.value());

        method.invoke(new UserMyAnnotation(), "Hello Sky");
    }

}
