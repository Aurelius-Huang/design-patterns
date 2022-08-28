package edu.aurelius.design.creational.builder;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public interface Builder {

    Builder append(char c);

    String build();

}
