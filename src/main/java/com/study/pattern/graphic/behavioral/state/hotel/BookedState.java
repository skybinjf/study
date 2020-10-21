package com.study.pattern.graphic.behavioral.state.hotel;

/**
 * 已预订状态
 *
 * @author Sky
 * @date 2020-10-21 15:43.
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已被预订。");
    }
}
