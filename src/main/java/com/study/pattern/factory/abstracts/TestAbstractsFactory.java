package com.study.pattern.factory.abstracts;

import com.study.pattern.factory.abstracts.po.BoyInterface;
import com.study.pattern.factory.abstracts.po.GirlInterface;

/**
 * 测试抽象工厂
 *
 * @author Sky
 * @Date 2019-01-27 14:20.
 */
public class TestAbstractsFactory {

    public static void main(String[] args) {
        // 1 抽象工厂获取圣诞系列的女孩
        System.out.println("1 抽象工厂获取圣诞系列的女孩");
        PersonFactory factory = new ChristmasFactory();
        GirlInterface girl = factory.getGirl();
        girl.drawWomen();

        // 2 抽象工厂获取新年系列的男孩
        System.out.println("2 抽象工厂获取新年系列的男孩");
        PersonFactory factory1 = new NewYearFactory();
        BoyInterface boy = factory1.getBoy();
        boy.drawMan();

    }

}
