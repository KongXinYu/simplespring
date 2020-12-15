package demo.pattern.factory.singleton;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 使用容器方式实现单例
 * @author: WuZY
 * @time: 2020/12/15 0015
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object obj) {
        if (null != key && null != obj) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, obj);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }



}
