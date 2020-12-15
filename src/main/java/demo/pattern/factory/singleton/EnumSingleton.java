package demo.pattern.factory.singleton;

/**
 * @description: 枚举实现单例
 * @author: WuZY
 * @time: 2020/12/15
 */
public class EnumSingleton {

    private EnumSingleton(){
        if (ContainerHolder.HOLDER.INSTANCE != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static EnumSingleton getInstance() {
        return ContainerHolder.HOLDER.INSTANCE;
    }

    private enum ContainerHolder{
        HOLDER;
        private EnumSingleton INSTANCE;
        ContainerHolder() {
            INSTANCE  = new EnumSingleton();
        }
    }
}
