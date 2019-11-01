package com.study.patterns.factory.abstracts;

import com.study.patterns.factory.abstracts.po.BoyInterface;
import com.study.patterns.factory.abstracts.po.GirlInterface;
import com.study.patterns.factory.abstracts.po.NewYearBoy;
import com.study.patterns.factory.abstracts.po.NewYearGirl;

/**
 * 新年系列加工厂
 *
 * @author Sky
 * @Date 2019-01-27 14:22.
 */
public class NewYearFactory implements PersonFactory {
    @Override
    public BoyInterface getBoy() {
        return new NewYearBoy();
    }

    @Override
    public GirlInterface getGirl() {
        return new NewYearGirl();
    }
}
