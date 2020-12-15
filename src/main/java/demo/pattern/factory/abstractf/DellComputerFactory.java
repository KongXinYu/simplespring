package demo.pattern.factory.abstractf;

import demo.pattern.factory.entity.DellKeyboard;
import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.Keyboard;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/9 0009 下午 2:41
 */
public class DellComputerFactory implements ComputerFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
