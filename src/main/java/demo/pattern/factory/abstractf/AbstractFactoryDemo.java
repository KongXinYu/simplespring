package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.Keyboard;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/9 0009 下午 2:38
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new DellComputerFactory();

        Keyboard keyboard = computerFactory.createKeyboard();
        Mouse mouse = computerFactory.createMouse();

        keyboard.sayHello();
        mouse.sayHi();
    }
}
