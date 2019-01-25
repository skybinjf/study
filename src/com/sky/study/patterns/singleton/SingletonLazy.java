package com.sky.study.patterns.singleton;

/**
 * 单例模式（懒汉模式）
 * <p>
 *     1 线程不安全
 *     2 加载类时比较快
 *     3 运行时第一次获取对象比较慢
 * </p>
 * @author Sky
 * @Date 2019-01-25 14:00.
 */
public class SingletonLazy {
    /**
     * 1 构造函数私有化，不允许外部直接创建Singleton类对象
     */
    private SingletonLazy(){}

    /**
     * 声明实例，不创建实例
     */
    private static SingletonLazy instance = null;

    public static SingletonLazy getInstance(){
        if(instance == null){
            // 注意：不能直接 return new SingletonLazy();
            instance = new SingletonLazy();
            return instance;
        }
        return instance;
    }

}
