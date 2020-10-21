package com.study.pattern.graphic.behavioral.state;

/**
 * 开始状态类
 *
 * @author Sky
 * @date 2020-10-21 15:26.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state.";
    }
}
