package demo.pattern.factory.singleton;

/**
 * @description: 双重检查锁机制的懒汉单例模式
 * @author: WuZY
 * @time: 2020/12/15 0015
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton INSTANCE = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
