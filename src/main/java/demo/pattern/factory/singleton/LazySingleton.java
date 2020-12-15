package demo.pattern.factory.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: 普通懒汉模式
 * @author: WuZY
 * @time: 2020/12/15 0015
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance());
        System.out.println(LazySingleton.getInstance());
    }

}
