package com.robam.factory.abstract_factory;

import com.robam.factory.simple.AudiCar;
import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 11:07
 */
public class AudiFactory extends AbstractFactory{

    @Override
    Car getCar() {
        return new AudiCar();
    }
}
