package edu.aurelius.design.creational.builder;

import java.util.Arrays;

/**
 * @author Aurelius Huang
 * @since 2022-08-28
 */
public class StringBuilder implements Builder {

    char[] value;
    int count;

    public StringBuilder(int capacity) {
        this.count = 0;
        value = new char[capacity];
    }

    @Override
    public Builder append(char c) {
        // overflow-conscious code
        if (count + 1 - value.length > 0) {
            int newCapacity = value.length * 2 + 2;
            if (newCapacity - count < 1) {
                newCapacity = count + 1;
            }
            if (newCapacity < 0) {
                // overflow
                if (count < -1) {
                    throw new OutOfMemoryError();
                }
                newCapacity = Integer.MAX_VALUE;
            }
            value = Arrays.copyOf(value, newCapacity);
        }
        value[count++] = c;
        return this;
    }

    @Override
    public String build() {
        return new String(value, 0, count);
    }
}
