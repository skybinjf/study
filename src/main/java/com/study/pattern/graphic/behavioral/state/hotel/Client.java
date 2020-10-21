package com.study.pattern.graphic.behavioral.state.hotel;

/**
 * 客户端类
 *
 * @author Sky
 * @date 2020-10-21 15:48.
 */
public class Client {

    public static void main(String[] args) {
        HomeContext homeContext = new HomeContext();

        homeContext.setState(new FreeState());

        homeContext.setState(new BookedState());

        homeContext.setState(new CheckedInState());
    }

}
