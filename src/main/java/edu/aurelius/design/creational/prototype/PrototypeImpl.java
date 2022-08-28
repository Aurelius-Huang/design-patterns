package edu.aurelius.design.creational.prototype;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class PrototypeImpl implements Prototype {

    String field;

    public PrototypeImpl(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new PrototypeImpl(field);
    }

    @Override
    public String toString() {
        return this.field;
    }
}
