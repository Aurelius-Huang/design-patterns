package edu.aurelius.design.creational.simplefactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Client.
 *
 * @author Aurelius Huang
 * @since 2022-08-28
 */
class SimpleFactoryTest {

    /**
     * 在 Client 实现复杂的条件判断选择实现类实例化的逻辑
     */
    @Test
    void testProduct() {
        String type = "a";
        Product product;
        switch (type) {
            case "a":
                product = new ProductAImpl();
                break;
            case "b":
                product = new ProductBImpl();
                break;
            default:
                product = new ProductImpl();
        }

        Assertions.assertInstanceOf(ProductAImpl.class, product);
    }

    /**
     * 通过 SimpleFactory 实例化指定实现类
     */
    @Test
    void testSimpleFactory() {
        String type = "a";
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(type);
        Assertions.assertInstanceOf(ProductAImpl.class, product);
    }
}
