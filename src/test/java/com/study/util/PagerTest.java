package com.study.util;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试分页类
 *
 * @author Sky
 * @date 2020-12-02 18:52.
 */
public class PagerTest {

    List<Map<String, Object>> listMap = new ArrayList<>(32);

    @Before
    public void init() {
        for (int i = 0; i < 32; i++) {
            Map<String, Object> map1 = new HashMap<>(8);
            map1.put("bin" + i, "jiefeng" + i);
            map1.put("he" + i, "haiyan" + i);
            map1.put("li" + i, "qiuming" + i);
            map1.put("fang" + i, "jihua" + i);
            map1.put("yuan" + i, "minting" + i);
            listMap.add(map1);
        }
    }

    @Test
    public void testPager() {
        Pager<Map<String, Object>> pager = new Pager<>(4, 10, listMap);
        System.out.println("CurrentPage: " + pager.getCurrentPage());
        System.out.println("PageSize: " + pager.getPageSize());
        System.out.println("TotalPage: " + pager.getTotalPage());
        System.out.println("TotalRecord: " + pager.getTotalRecord());
        for (Map<String, Object> map : pager.getDataList()) {
            System.out.println("DataList: " + map.keySet());
        }
    }



}
