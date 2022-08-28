package edu.aurelius.design.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
class BuilderTest {

    @Test
    void testBuilder() {
        StringBuilder builder = new StringBuilder(16);
        for (int i = 0; i < 32; i++) {
            builder.append((char) ('c' + i));
        }

        String s = builder.build();
        System.out.println(s);
        Assertions.assertEquals(32, s.length());
    }

    @Test
    void testDirector() {
        StringBuilder builder = new StringBuilder(16);
        Director director = new Director(builder);
        String s = director.getSomeString(32);
        System.out.println(s);
        Assertions.assertEquals(32, s.length());
    }
}
