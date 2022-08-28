package edu.aurelius.design.creational.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class FactoryTest {
    @Test
    void testFactory() {
        FactoryImpl factory = new FactoryImpl();
        Product product = factory.factoryMethod();
        Assertions.assertInstanceOf(ProductImpl.class, product);
    }
}
