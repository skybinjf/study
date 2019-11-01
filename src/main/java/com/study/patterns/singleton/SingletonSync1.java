package com.study.patterns.singleton;

/**
 * 多线程时同步单实例类（直接同步方法，简单粗暴，性能低）
 *
 * @author Sky
 * @create 2019-03-30 上午11:32
 **/
public class SingletonSync1 {

    private static SingletonSync1 singletonSync1 = null;

    private SingletonSync1(){}

    // 同步会降低性能，并且只有第一次执行此方法时，才真正需要同步
    public static synchronized SingletonSync1 getInstance(){
        if(singletonSync1 == null){
            singletonSync1 = new SingletonSync1();
        }
        return singletonSync1;
    }


}
