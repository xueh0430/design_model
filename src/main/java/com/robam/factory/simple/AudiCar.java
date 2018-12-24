package com.robam.factory.simple;

/**
 * @author Zerox
 * @date 2018/12/24 10:12
 */
public class AudiCar implements Car{

    /**
     * 生产一辆奥迪车
     * @return
     */
    @Override
    public Car getCar() {

        return new AudiCar();
    }
}
