package com.study.pattern.graphic.behavioral.state.hotel;

/**
 * 酒店系统中，状态有：已预订、已入住、空闲
 *
 * @author Sky
 * @Date 2020-10-21 15:41.
 */
public interface State {

    void handle();
}
