package com.study.patterns.factory.methods.po;

/**
 * 中分发型
 *
 * @author Sky
 * @Date 2019-01-27 13:59.
 */
public class HairIn implements com.study.patterns.factory.methods.po.HairInterface {
    @Override
    public void draw() {
        System.out.println("-----------------中偏分发型-------------------");
    }
}
