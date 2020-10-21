package com.study.pattern.graphic.behavioral.state.hotel;

/**
 * 空闲状态
 *
 * @author Sky
 * @date 2020-10-21 15:42.
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲。");
    }
}
