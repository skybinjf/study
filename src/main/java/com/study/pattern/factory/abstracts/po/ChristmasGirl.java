package com.study.pattern.factory.abstracts.po;

/**
 * 圣诞系列的女孩
 *
 * @author Sky
 * @Date 2019-01-27 14:16.
 */
public class ChristmasGirl implements GirlInterface {
    @Override
    public void drawWomen() {
        System.out.println("-----------------圣诞系列的女孩子--------------------");
    }
}
