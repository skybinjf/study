package com.study.pattern.factory.abstracts;

import com.study.pattern.factory.abstracts.po.BoyInterface;
import com.study.pattern.factory.abstracts.po.GirlInterface;

/**
 * 获取人物接口
 *
 * @author Sky
 * @Date 2019-01-27 14:11.
 */
public interface PersonFactory {
    /**
     * 男孩接口
     * @return
     */
    BoyInterface getBoy();

    /**
     * 女孩接口
     * @return
     */
    GirlInterface getGirl();
}
