package com.study.pattern.graphic.behavioral.strategy;

/**
 * Context，环境类
 *
 * @author Sky
 * @date 2020-10-21 16:38.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略类的方法
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
