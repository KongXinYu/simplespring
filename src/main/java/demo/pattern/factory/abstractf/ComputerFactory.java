package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.Keyboard;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: Administrator
 * @time: 2020/12/9 0009 下午 2:38
 */
public interface ComputerFactory {
    public Mouse createMouse();

    public Keyboard createKeyboard();
}
