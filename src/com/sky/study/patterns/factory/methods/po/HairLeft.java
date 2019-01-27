package com.sky.study.patterns.factory.methods.po;

/**
 * 左偏分发型
 *
 * @author Sky
 * @Date 2019-01-27 13:03.
 */
public class HairLeft implements HairInterface {
    @Override
    public void draw() {
        System.out.println("-----------------左偏分发型-------------------");
    }
}
