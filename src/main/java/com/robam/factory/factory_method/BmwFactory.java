package com.robam.factory.factory_method;

import com.robam.factory.simple.BmwCar;
import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 10:39
 */
public class BmwFactory implements Factory{

    /**
     * 别摸我车间产别摸我
     *
     * @return
     */
    @Override
    public Car getCarByFactoryStandard() {

        return new BmwCar();
    }
}
