package com.robam.factory.factory_method;

import com.robam.factory.simple.AudiCar;
import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 10:34
 */
public class AudiFactory implements Factory{

    /**
     * 奥迪车间产奥迪
     *
     * @return
     */
    @Override
    public Car getCarByFactoryStandard() {

        return new AudiCar();
    }
}
