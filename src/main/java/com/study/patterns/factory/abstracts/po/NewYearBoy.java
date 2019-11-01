package com.study.patterns.factory.abstracts.po;

/**
 * 新年系列的男孩子
 *
 * @author Sky
 * @Date 2019-01-27 14:23.
 */
public class NewYearBoy implements BoyInterface {
    @Override
    public void drawMan() {
        System.out.println("-----------------新年系列的男孩子--------------------");
    }
}
