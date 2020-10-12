package com.study.pattern.graphic.structural.proxy.image;

/**
 * 测试类
 *
 * @author Sky
 * @date 2020-10-10 16:15.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        // 从磁盘中加载图片
        System.out.println("从磁盘中加载图片");
        image.display();
        System.out.println("不需要从磁盘中加载图片");
        image.display();
    }

}
