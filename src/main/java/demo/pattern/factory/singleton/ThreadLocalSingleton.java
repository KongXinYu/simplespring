package demo.pattern.factory.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/15 0015
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal
            = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton (){}

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor constructor = ThreadLocalSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
