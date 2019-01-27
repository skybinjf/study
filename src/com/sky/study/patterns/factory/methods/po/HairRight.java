package com.sky.study.patterns.factory.methods.po;

/**
 * 右偏分发型
 *
 * @author Sky
 * @Date 2019-01-27 13:04.
 */
public class HairRight implements HairInterface {

    @Override
    public void draw() {
        System.out.println("-----------------右偏分发型-------------------");
    }
}
