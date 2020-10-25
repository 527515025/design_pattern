package com.abel;

import com.abel.brand.AbstractCar;
import com.abel.brand.BMWCar;
import com.abel.brand.BenZCar;
import com.abel.transmission.Auto;
import com.abel.transmission.Manual;
import com.abel.transmission.Transmission;

/**
 *
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化
 *
 * 有了变速器和品牌两个维度各自的实现后，可以通过聚合，实现不同品牌不同变速器的车
 * @author yyb
 * @time 2020/10/25
 */
public class BridgeClient {


    public static void main(String[] args) {
        //自动挡
        Transmission auto = new Auto();
        //宝马车
        AbstractCar bmw = new BMWCar();
        bmw.setTransmission(auto);
        bmw.run();


        //手动挡
        Transmission manual = new Manual();
        //奔驰车
        AbstractCar benz = new BenZCar();
        benz.setTransmission(manual);
        benz.run();
    }
}
