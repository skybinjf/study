package com.study.pattern.graphic.creational.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 工厂方法模式日志测试类
 *
 * @author Sky
 * @date 2019-11-28 17:13.
 */
@SpringBootTest
public class FactoryMethodTest {

    /**
     * 工厂方法类创建对象测试
     */
    @Test
    public void TestCreateLogProduct() {
        LogFactory logFactory1 = new FileLogFactory();
        LogFactory logFactory2 = new DatabaseLogFactory();

        Log log1 = logFactory1.createLog();
        Log log2 = logFactory2.createLog();

        log1.writeLog();
        log2.writeLog();
    }

}
