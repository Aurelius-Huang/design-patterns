package edu.aurelius.design.creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
class PrototypeTest {
    @Test
    void testPrototype() {
        PrototypeImpl prototype = new PrototypeImpl("abc");
        Prototype other = prototype.clone();
        System.out.println(other);
        Assertions.assertEquals("abc", other.toString());
    }
}
