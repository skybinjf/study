package com.study.pattern.graphic.creational.factory.method;

/**
 * 具体产品
 * 数据库型日志产品类
 *
 * @author Sky
 * @date 2019-11-28 16:52.
 */
public class DatabaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("DatabaseLog writing...");
    }
}
