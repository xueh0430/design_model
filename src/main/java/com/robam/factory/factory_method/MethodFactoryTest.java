package com.robam.factory.factory_method;

import org.junit.Test;

/**
 * @author Zerox
 * @date 2018/12/24 10:40
 */
public class MethodFactoryTest {

    @Test
    public void testFactoryMethod() {

        /** 产奥迪*/
        Factory car = new AudiFactory();
        System.out.println(car);

        /** 产奔驰*/
        car = new BenzFactory();
        System.out.println(car);

        /** 产宝马*/
        car = new BmwFactory();
        System.out.println(car);


    }
}
