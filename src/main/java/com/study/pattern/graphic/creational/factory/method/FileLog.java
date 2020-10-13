package com.study.pattern.graphic.creational.factory.method;

/**
 * 具体产品
 * 文件型日志产品类
 *
 * @author Sky
 * @date 2019-11-28 16:50.
 */
public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("FileLog writing...");
    }
}
