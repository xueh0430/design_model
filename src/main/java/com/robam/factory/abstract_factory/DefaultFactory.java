package com.robam.factory.abstract_factory;

import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 11:11
 */
public class DefaultFactory extends AbstractFactory{


    private AudiFactory defaultFactory = new AudiFactory();
    @Override
    Car getCar() {
        return defaultFactory.getCar();
    }
}
