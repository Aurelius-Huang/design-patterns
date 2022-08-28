package edu.aurelius.design.creational.abstractfactory;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class Product2Factory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
