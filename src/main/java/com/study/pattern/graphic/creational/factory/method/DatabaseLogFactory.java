package com.study.pattern.graphic.creational.factory.method;

/**
 * 具体工厂
 * 数据库型日志工厂子类
 *
 * @author Sky
 * @date 2019-11-28 16:54.
 */
public class DatabaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
