package edu.aurelius.design.creational.factorymethod;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class FactoryImpl extends Factory {
    @Override
    public Product factoryMethod() {
        return new ProductImpl();
    }
}
