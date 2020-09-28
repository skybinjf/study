package com.study.pattern.graphic.structural.adapter.twoway;

/**
 * 双向适配器适配者接口实现
 *
 * @author Sky
 * @date 2020-09-28 14:27.
 */
public class TwoWayAdapteeImpl implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者实现类……");
    }
}
