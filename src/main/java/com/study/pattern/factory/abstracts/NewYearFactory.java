package com.study.pattern.factory.abstracts;

import com.study.pattern.factory.abstracts.po.BoyInterface;
import com.study.pattern.factory.abstracts.po.GirlInterface;
import com.study.pattern.factory.abstracts.po.NewYearBoy;
import com.study.pattern.factory.abstracts.po.NewYearGirl;

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
