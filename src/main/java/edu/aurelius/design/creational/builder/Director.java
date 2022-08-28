package edu.aurelius.design.creational.builder;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String getSomeString(int count) {
        for (int i = 0; i < count; i++) {
            builder.append((char) ('c' + i));
        }
        return builder.build();
    }
}
