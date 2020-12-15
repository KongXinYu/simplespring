package demo.pattern.factory.method;

import demo.pattern.factory.entity.IBMMouse;
import demo.pattern.factory.entity.Mouse;

/**
 * @description:
 * @author: WuZY
 * @time: 2020/12/9 0009 下午 1:42
 */
public class IBMMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }
}
