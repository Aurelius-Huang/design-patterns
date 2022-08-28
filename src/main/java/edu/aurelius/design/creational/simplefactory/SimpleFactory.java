package edu.aurelius.design.creational.simplefactory;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class SimpleFactory {

    public Product createProduct(String type) {
        switch (type) {
            case "a":
                return new ProductAImpl();
            case "b":
                return new ProductBImpl();
            default:
                return new ProductImpl();
        }
    }
}