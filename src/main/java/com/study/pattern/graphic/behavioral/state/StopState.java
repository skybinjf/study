package com.study.pattern.graphic.behavioral.state;

/**
 * 结束状态类
 *
 * @author Sky
 * @date 2020-10-21 15:29.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop state.";
    }
}
