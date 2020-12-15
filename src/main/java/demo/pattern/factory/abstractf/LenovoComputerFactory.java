package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.Keyboard;
import demo.pattern.factory.entity.LenovoKeyboard;
import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/9 0009 下午 2:43
 */
public class LenovoComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LenovoKeyboard();
    }
}
