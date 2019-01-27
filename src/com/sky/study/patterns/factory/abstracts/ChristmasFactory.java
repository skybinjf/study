package com.sky.study.patterns.factory.abstracts;

import com.sky.study.patterns.factory.abstracts.po.BoyInterface;
import com.sky.study.patterns.factory.abstracts.po.ChristmasBoy;
import com.sky.study.patterns.factory.abstracts.po.ChristmasGirl;
import com.sky.study.patterns.factory.abstracts.po.GirlInterface;

/**
 * 圣诞系列加工厂
 *
 * @author Sky
 * @Date 2019-01-27 14:18.
 */
public class ChristmasFactory implements PersonFactory {
    @Override
    public BoyInterface getBoy() {
        return new ChristmasBoy();
    }

    @Override
    public GirlInterface getGirl() {
        return new ChristmasGirl();
    }
}
