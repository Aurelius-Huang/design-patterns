package edu.aurelius.design.creational.factorymethod;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public abstract class Factory {

    public abstract Product factoryMethod();

    public Product doSomething() {
        Product product = this.factoryMethod();
        // do something.
        return product;
    }
}
