package com.robam.factory.factory_method;

import com.robam.factory.simple.BenzCar;
import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 10:38
 */
public class BenzFactory implements Factory{

    /**
     * 奔驰车间产奔驰
     *
     * @return
     */
    @Override
    public Car getCarByFactoryStandard() {

        return new BenzCar();
    }
}
