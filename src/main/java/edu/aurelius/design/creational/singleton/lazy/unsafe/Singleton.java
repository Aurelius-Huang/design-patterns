package edu.aurelius.design.creational.singleton.lazy.unsafe;

import java.util.Objects;

/**
 * <p><pre>
 * 懒汉模式-线程不安全
 * 1. 在用到该类时才实例化，节约资源
 * 2. 多线程场景下 if(Objects.isNull(instance)) 存在多个线程同时满足条件的可能，这可能导致多次执行 new Singleton()
 * </pre></p>
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }
}
