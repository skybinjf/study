package com.study.pattern.graphic.behavioral.state;

/**
 * Context 类
 *
 * @author Sky
 * @date 2020-10-21 15:25.
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
