package com.robam.factory.abstract_factory;

import com.robam.factory.simple.AudiCar;
import com.robam.factory.simple.BenzCar;
import com.robam.factory.simple.BmwCar;
import com.robam.factory.simple.Car;

/**
 * @author Zerox
 * @date 2018/12/24 11:05
 */
public abstract class AbstractFactory {

    abstract  Car getCar();

    Car getMyCar(String carName) {

        if (carName.equalsIgnoreCase("Audi")) {
            return new AudiCar();
        } else if (carName.equalsIgnoreCase("Benz")) {
            return new BenzCar();
        } else if (carName.equalsIgnoreCase("BMW")) {
            return new BmwCar();
        } else {
            System.out.println("不好意思~本公司没有!");
            return null;
        }
    }
}
