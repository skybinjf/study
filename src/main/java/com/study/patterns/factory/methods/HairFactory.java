package com.study.patterns.factory.methods;

import com.study.patterns.factory.methods.po.HairInterface;
import com.study.patterns.factory.methods.po.HairLeft;
import com.study.patterns.factory.methods.po.HairRight;
import com.study.patterns.factory.methods.utils.PropertiesReader;

import java.util.Map;

/**
 * 发型工厂，生成左偏分、中偏分、右偏分发型
 *
 * @author Sky
 * @Date 2019-01-27 13:01.
 */
public class HairFactory {

    /**
     * 根据类型来创建发型对象
     * @param key
     * @return
     */
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new HairLeft();
        }else if("right".equals(key)){
            return new HairRight();
        }
        return null;
    }

    /**
     * 利用反射，根据类型的名称（全类名）来生产对象
     * @param className
     * @return
     */
    public HairInterface getHairByClass(String className){
        try {
            HairInterface hair = (HairInterface) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 利用反射，根据类型的名称（全类名）来生产对象，把全类名放在配置文件中
     * @param key
     * @return
     */
    public HairInterface getHairByClassKey(String key){
        // 获取配置文件
        Map<String, String> map = new PropertiesReader().getProperties();
        try {
            HairInterface hair = (HairInterface)Class.forName(map.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
