package com.study.pattern.graphic.behavioral.state;

/**
 * 客户端类
 *
 * @author Sky
 * @date 2020-10-21 15:30.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
