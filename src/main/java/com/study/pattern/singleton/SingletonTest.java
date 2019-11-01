package com.study.pattern.singleton;

/**
 * 测试单例模式
 *
 * @author Sky
 * @Date 2019-01-25 13:39.
 */
public class SingletonTest {

    public static void main(String[] args) {
        // 饿汉模式
        SingletonHungry sh1 = SingletonHungry.getInstance();
        SingletonHungry sh2 = SingletonHungry.getInstance();
        if(sh1 == sh2){
            System.out.println("sh1 和 sh2 是同一个实例");
        }else {
            System.out.println("sh1 和 sh2 不是同一个实例");
        }

        // 懒汉模式
        SingletonLazy sl1 = SingletonLazy.getInstance();
        SingletonLazy sl2 = SingletonLazy.getInstance();
        if(sl1 == sl2){
            System.out.println("sl3 和 sl4 是同一个实例");
        }else {
            System.out.println("sl3 和 sl4 不是同一个实例");
        }

        // 低性能不同步
        SingletonSync1 ss1 = SingletonSync1.getInstance();
        SingletonSync1 ss2 = SingletonSync1.getInstance();
        if(ss1 == ss2){
            System.out.println("ss1 和 ss2 是同一个实例");
        }else {
            System.out.println("ss1 和 ss2 不是同一个实例");
        }

        // 高性能同步
        SingletonSync2 ss3 = SingletonSync2.getInstance();
        SingletonSync2 ss4 = SingletonSync2.getInstance();
        if(ss3 == ss4){
            System.out.println("ss3 和 ss4 是同一个实例");
        }else {
            System.out.println("ss3 和 ss4 不是同一个实例");
        }

    }

}
