package edu.aurelius.design.creational.singleton.lazy.safe;

import java.util.Objects;

/**
 * <p><pre>
 * 懒汉模式-线程安全
 * 1. 给 getInstance() 上锁，同一时间只能有一个线程进入 getInstance()，从而保证不会多次执行 new Singleton()
 * 2. 每次执行 getInstance() 都会加锁，性能欠佳
 * </pre></p>
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }
}
