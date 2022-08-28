package edu.aurelius.design.creational.singleton.lazy.doublecheck;

import java.util.Objects;

/**
 * <p><pre>
 * 懒汉模式-线程安全-双重检锁
 * 1. 只在 instance 为 null 时进入加锁实例化逻辑
 * 2. volatile 禁止编译器指令重排，从而避免多线程场景分配到空对象的问题
 *    instance = new Singleton() 被编译成三条执行：
 *      a. 为 instance 分配内存空间
 *      b. 初始化 instance
 *      c. 将 instance 指向分配的内存空间
 *    执行重排可能将 a->b->c 重排为 a->c->b，在多线程场景下，T1 执行了 a->c，T2 执行 getInstance 时，会跳过 if(Objects.isNull(instance)) 直接取得一个未完成实例化的对象
 * </pre></p>
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
