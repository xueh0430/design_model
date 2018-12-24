package com.robam.factory.simple;

/**
 * @author Zerox
 * @date 2018/12/24 10:04
 */
public interface Car {

    /**
     * 上面我们已经说到了,这里面我们定义的是规格
     *  a.要求必须是几个轱辘
     *  b.要求必须是汽油类
     *  c.要求必须有安全气囊
     *
     *  工厂工厂~什么是工厂？生产商品~生产统一规格的商品
     *  那么就我们这个造车车间估计也就能生产个汽车了~自行车恐怕都生产不了
     *  没那么大规格的自行车~烧油，四个轱辘的，还配有安全气囊！原谅我的贫穷。。。我真的没见过
     * @return
     */
    Car getCar();
}