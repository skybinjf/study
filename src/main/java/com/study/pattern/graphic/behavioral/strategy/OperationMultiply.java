package com.study.pattern.graphic.behavioral.strategy;

/**
 * 乘法策略
 *
 * @author Sky
 * @date 2020-10-21 16:37.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
