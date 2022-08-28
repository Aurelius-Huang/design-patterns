package edu.aurelius.design.creational.singleton.nested;

/**
 * <p><pre>
 * 静态内部类
 * 1. Singleton 类加载不会触发静态内部类 Nested 类的加载，只有在调用 getInstance() 访问 INSTANCE 时才会触发 Nested 加载
 * </pre></p>
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return Nested.INSTANCE;
    }

    private static class Nested {
        private static final Singleton INSTANCE = new Singleton();
    }
}
