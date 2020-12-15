package org.simpleframework.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;


/**
 * @description:
 * @author: Administrator
 * @time: 2020/12/15 0015 下午 3:04
 */
class ClassUtilTest {

    @DisplayName("提取目标类方法：extractPackageClassTest")
    @Test
    void extractPackageClass() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.wzy.entity");
        System.out.println(classSet);
        Assertions.assertEquals(4, classSet.size());


    }
}