package com.study.pattern.factory.methods;

import com.study.pattern.factory.methods.po.HairInterface;
import com.study.pattern.factory.methods.po.HairLeft;

/**
 *  工厂方法测试类
 *
 * @author Sky
 * @Date 2019-01-27 13:23.
 */
public class TestFactoryMethods {

    public static void main(String[] args) {

        // 1 使用接口 new 对象
        System.out.println("1. 使用接口 new 对象：");
        HairInterface left = new HairLeft();
        left.draw();

        // 2 使用工厂模式根据 key 获取对象
        System.out.println("2. 使用工厂模式根据 key 获取对象：");
        HairFactory factory = new HairFactory();
        HairInterface right = factory.getHair("right");
        right.draw();

        // 3 对2的改进：根据类名获取对象
        System.out.println("3. 对2的改进：根据类名获取对象：");
        HairInterface left1 = factory.getHairByClass("com.study.pattern.factory.methods.po.HairLeft");
        left1.draw();

        // 4 对3的改进：根据类名获取对象，全类名放到配置文件中
        System.out.println("4. 对3的改进：根据类名获取对象，全类名放到配置文件中");
        HairInterface hair = factory.getHairByClassKey("in");
        hair.draw();
    }

}
