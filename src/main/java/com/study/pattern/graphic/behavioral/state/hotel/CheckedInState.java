package com.study.pattern.graphic.behavioral.state.hotel;

/**
 * 已入住状态
 *
 * @author Sky
 * @date 2020-10-21 15:44.
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住。");
    }
}
