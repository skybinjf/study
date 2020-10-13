package com.study.pattern.graphic.creational.singleton;

/**
 * 多线程时同步单实例类，高性能（适合多线程中使用）
 *
 * @author Sky
 * @create 2019-03-30 上午11:42
 **/
public class SingletonSync2 {

    private SingletonSync2(){}

    /** volatile 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的 */
    private volatile static SingletonSync2 singletonSync2 = null;

    /**
     * 方法不同步，先检查实例，不存在时再进入同步区
     * @return
     */
    public static SingletonSync2 getInstance(){
        if(singletonSync2 == null){
            synchronized (SingletonSync2.class){
                // 进入同步区后再检查一次，如果仍是空，才创建实例。避免其他线程刚创建完实例释放锁后的情况
                if(singletonSync2 == null){
                    singletonSync2 = new SingletonSync2();
                }
            }
        }
        return singletonSync2;
    }

}
