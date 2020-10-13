package com.study.pattern.graphic.structural.adapter.twoway;

/**
 * 双向适配器测试类
 *
 * @author Sky
 * @date 2020-09-28 14:31.
 */
public class TwoWayAdapterTest {

    public static void main(String[] args) {
        // 目标通过双向适配器访问适配者
        TwoWayAdaptee adaptee = new TwoWayAdapteeImpl();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("==============================");

        // 适配者通过双向适配器访问目标
        TwoWayTarget target2 = new TwoWayTargetImpl();
        TwoWayAdaptee adaptee2 = new TwoWayAdapter(target2);
        adaptee2.specificRequest();
    }

}
