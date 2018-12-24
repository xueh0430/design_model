package com.robam.factory.simple;

/**
 * @author Zerox
 * @date 2018/12/24 10:10
 */
public class BmwCar implements Car{

    /**
     * 生产一辆宝马车
     * @return
     */
    @Override
    public Car getCar() {
        return new BmwCar();
    }
}
