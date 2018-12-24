package com.robam.factory.factory_method;

import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 10:32
 */
public interface Factory {


    /**
     *   a.车间安全标准
     *   b.车间排气标准
     *
     *
     * @return 按照该标准所生产的汽车
     */
    Car getCarByFactoryStandard();
}
