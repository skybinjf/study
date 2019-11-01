package com.study.annotation;

/**
 * 2 使用注解
 *
 * @author Sky
 * @Date 2019-01-10 14:23.
 */
public class UserMyAnnotation {

    @MyAnnotation(name= "Sky", value = 30)
    public void printMyAnnotation(String str){
        System.out.println("str:" + str);
    }

}
