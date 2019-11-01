package com.study.patterns.factory.abstracts.po;

/**
 * 新年系列的女孩子
 *
 * @author Sky
 * @Date 2019-01-27 14:23.
 */
public class NewYearGirl implements GirlInterface {
    @Override
    public void drawWomen() {
        System.out.println("-----------------新年系列的女孩子--------------------");
    }
}
