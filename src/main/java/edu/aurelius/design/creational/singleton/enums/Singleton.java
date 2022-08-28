package edu.aurelius.design.creational.singleton.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p><pre>
 * 枚举
 * 1. 防止反射攻击，其他实现可以通过反射的 setAccessible() 将 private 构造方法设置为 public，从而调用构造函数进行实例化对象，而 JVM 保证 Enum 类只会被实例化一次
 * 2. 无需担心反序列化得到多个实例，其他实现则需要通过 transient 屏蔽所有字段，并自行实现序列化与反序列化
 * </pre></p>
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
@Getter
@NoArgsConstructor
public enum Singleton {

    /**
     * 单实例
     */
    INSTANCE;

    String property;

    public void setProperty(String property) {
        this.property = property;
    }
}
