package com.robam.factory.simple;

import org.junit.Test;

/**
 * @author Zerox
 * @date 2018/12/24 10:16
 */
public class SimpleFactoryTest {

    @Test
    public void testSimpleFactory() {

        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMyCar("audi"));

        System.out.println(simpleFactory.getMyCar("benz"));

        System.out.println(simpleFactory.getMyCar("bmw"));
    }
}
