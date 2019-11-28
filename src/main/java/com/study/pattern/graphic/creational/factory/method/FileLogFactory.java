package com.study.pattern.graphic.creational.factory.method;

/**
 * 具体工厂
 * 文件型日志工厂子类
 *
 * @author Sky
 * @date 2019-11-28 16:53.
 */
public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
