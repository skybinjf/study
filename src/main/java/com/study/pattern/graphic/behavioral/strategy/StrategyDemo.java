package com.study.pattern.graphic.behavioral.strategy;

/**
 * 客户端
 *
 * @author Sky
 * @date 2020-10-21 16:41.
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Strategy addStrategy = new OperationAdd();
        Context context = new Context(addStrategy);
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        Strategy subtractStrategy = new OperationSubtract();
        context = new Context(subtractStrategy);
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        Strategy multiplyStrategy = new OperationMultiply();
        context = new Context(multiplyStrategy);
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
