package demo.pattern.factory.singleton;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @description: 静态内部类的懒汉模式
 * @author: WuZY
 * @time: 2020/12/15 0015
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        if(InnerClass.INSTANCE != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

}
