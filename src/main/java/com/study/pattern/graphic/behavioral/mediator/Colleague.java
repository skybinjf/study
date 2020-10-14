package com.study.pattern.graphic.behavioral.mediator;

/**
 * 抽象同事类
 *
 * @author Sky
 * @date 2020-10-14 14:14.
 */
public abstract class Colleague {

    /**
     * 持有一个中介者对象
     */
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 获取中介者对象
     * @return
     */
    public Mediator getMediator() {
        return mediator;
    }

    /**
     * 执行某些操作时，需要通知中介者，让中介者去调用被影响的其他同事类
     */
    public abstract void operate();

    /**
     * 当某一个同事类发生变化时协助其变化
     */
    public abstract void doHelp();
}
