package com.robam.factory.abstract_factory;

import com.robam.factory.simple.Car;
import org.junit.Test;

/**
 * @author Zerox
 * @date 2018/12/24 11:09
 */
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {

        DefaultFactory defaultFactory = new DefaultFactory();

        Car car = defaultFactory.getMyCar("audi");
        System.out.println(car);

        car = defaultFactory.getMyCar("benz");
        System.out.println(car);

        car = defaultFactory.getMyCar("bmw");
        System.out.println(car);
    }
}
