package com.study.patterns.factory.methods.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties 文件读取工具
 *
 * @author Sky
 * @Date 2019-01-27 13:48.
 */
public class PropertiesReader {

    public Map<String, String> getProperties(){
        Properties props = new Properties();
        Map<String, String> map = new HashMap<>(16);
        try {
            InputStream  in = getClass().getResourceAsStream("../type.properties");
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()){
                String key  = (String)en.nextElement();
                String value = props.getProperty(key);
                map.put(key, value);
                System.out.println("配置文件 type.properties 的 key= " + key + ", value= " + value);
            }
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
