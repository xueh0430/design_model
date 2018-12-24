package com.robam.factory.simple;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author Zerox
 * @date 2018/12/24 10:13
 */
public class SimpleFactory {


    public Car getMyCar(String carName) {

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
