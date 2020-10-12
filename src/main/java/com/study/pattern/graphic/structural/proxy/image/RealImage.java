package com.study.pattern.graphic.structural.proxy.image;

/**
 * 真实图片展现类
 *
 * @author Sky
 * @date 2020-10-10 16:06.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }

    /**
     * 从磁盘中加载图片
     */
    private void loadFromDisk(String fileName) {
        System.out.println("loading " + fileName + " from disk.");
    }

}
