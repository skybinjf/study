package com.study.pattern.graphic.structural.adapter.twoway;

/**
 * 双向适配器
 *
 * @author Sky
 * @date 2020-09-28 14:28.
 */
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {

    private TwoWayTarget twoWayTarget;
    private TwoWayAdaptee twoWayAdaptee;

    public TwoWayAdapter(TwoWayTarget twoWayTarget) {
        this.twoWayTarget = twoWayTarget;
    }

    public TwoWayAdapter(TwoWayAdaptee twoWayAdaptee) {
        this.twoWayAdaptee = twoWayAdaptee;
    }

    @Override
    public void specificRequest() {
        System.out.println("使用适配者……");
        twoWayTarget.request();
    }

    @Override
    public void request() {
        System.out.println("使用适配者……");
        twoWayAdaptee.specificRequest();
    }
}
