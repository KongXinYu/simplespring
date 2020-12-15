package demo.pattern.factory.method;

import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/9 0009 下午 1:39
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        MouseFactory factory = new IBMMouseFactory();
        Mouse mouse = factory.createMouse();
        mouse.sayHi();
    }
}
