package edu.aurelius.design.creational.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
class AbstractFactoryTest {

    @Test
    void testAbstractFactory() {
        AbstractFactory factory = new Product1Factory();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        Assertions.assertInstanceOf(ProductA1.class, productA);
        Assertions.assertInstanceOf(ProductB1.class, productB);
    }
}
