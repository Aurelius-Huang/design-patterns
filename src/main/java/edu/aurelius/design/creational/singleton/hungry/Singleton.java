package edu.aurelius.design.creational.singleton.hungry;

/**
 * <p><pre>
 * 饿汉模式-线程安全
 * 1. 直接实例化 instance，不存在多线程下多次实例化对象问题，但丢失延迟加载特性
 * </pre></p>
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
