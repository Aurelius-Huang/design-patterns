package edu.aurelius.design.creational.singleton;

import edu.aurelius.design.creational.singleton.enums.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
class SingletonTest {

    @Test
    void testSingleton() {
        Singleton a = Singleton.INSTANCE;
        a.setProperty("a");
        System.out.println(a.getProperty());

        // 多次获取的对象都是同一个对象
        Singleton b = Singleton.INSTANCE;
        System.out.println(b.getProperty());
        b.setProperty("b");
        System.out.println(a.getProperty());
        System.out.println(b.getProperty());

        // 反射所得依旧是上面的对象
        Singleton[] enumConstants = Singleton.class.getEnumConstants();
        for (Singleton enumConstant : enumConstants) {
            System.out.println(enumConstant.getProperty());
        }

        Assertions.assertEquals(a, b);
    }
}
