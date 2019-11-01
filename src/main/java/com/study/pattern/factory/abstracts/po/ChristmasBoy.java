package com.study.pattern.factory.abstracts.po;

/**
 * 圣诞系列的男孩子
 *
 * @author Sky
 * @Date 2019-01-27 14:16.
 */
public class ChristmasBoy implements BoyInterface {
    @Override
    public void drawMan() {
        System.out.println("-----------------圣诞系列的男孩子--------------------");
    }
}
