package demo.pattern.factory.method;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/9 0009 下午 1:41
 */
public class DellMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
