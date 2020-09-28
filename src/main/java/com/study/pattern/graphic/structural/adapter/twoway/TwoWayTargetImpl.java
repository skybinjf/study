package com.study.pattern.graphic.structural.adapter.twoway;

/**
 * 双向适配器目标接口实现
 *
 * @author Sky
 * @date 2020-09-28 14:26.
 */
public class TwoWayTargetImpl implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标实现类……");
    }
}
