package com.study.pattern.graphic.structural.proxy.image;

/**
 * 代理图片展现类
 *
 * @author Sky
 * @date 2020-10-10 16:11.
 */
public class ProxyImage implements Image {

    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
