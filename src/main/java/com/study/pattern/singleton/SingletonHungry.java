package com.study.pattern.singleton;

/**
 * 单例模式，在配置文件、工具类、线程池、缓存、日志对象等场景中适合使用
 * 单例模式（饿汉模式）
 * <p>
 *     1 线程安全
 *     2 加载类时比较慢
 *     3 运行时获取对象比较快
 * </p>
 *
 * @author Sky
 * @Date 2019-01-25 13:37.
 */
public class SingletonHungry {
    /**
     * 1 构造函数私有化，不允许外部直接创建Singleton类对象
     */
    private SingletonHungry(){}

    /**
     * 2 创建类的唯一实例，用 private static 修饰
     */
    private static SingletonHungry singleton = new SingletonHungry();

    /**
     * 提供一个获取实例的方法，用 public static 修饰，通过 SingletonHungry.getInstance() 获取实例
     * @return
     */
    public static SingletonHungry getInstance(){
        return singleton;
    }

}
