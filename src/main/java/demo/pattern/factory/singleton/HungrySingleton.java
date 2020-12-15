package demo.pattern.factory.singleton;

import java.io.Serializable;

/**
 *
 * @description: 饿汉模式
 * @author: WuZY
 * @time: 2020/12/15
 */
public class HungrySingleton implements Serializable,Cloneable{

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
