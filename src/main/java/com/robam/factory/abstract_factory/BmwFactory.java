package com.robam.factory.abstract_factory;

import com.robam.factory.simple.BmwCar;
import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 11:08
 */
public class BmwFactory extends AbstractFactory{

    @Override
    Car getCar() {
        return new BmwCar();
    }
}
