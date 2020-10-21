package com.study.pattern.graphic.behavioral.state.hotel;

/**
 * 房间对象
 * 如果是银行系统，这个Context类就是账号。根据金额不同，切换不同的状态
 * @author Sky
 * @date 2020-10-21 15:45.
 */
public class HomeContext {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }
}
