package com.robam.factory.simple;

/**
 * @author Zerox
 * @date 2018/12/24 10:11
 */
public class BenzCar  implements Car{
    /**
     * 生产一辆奔驰车
     *
     * @return
     */
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
