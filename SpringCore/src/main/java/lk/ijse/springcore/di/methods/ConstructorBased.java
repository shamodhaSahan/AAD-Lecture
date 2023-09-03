package lk.ijse.springcore.di.methods;

import lk.ijse.springcore.di.Car;
import lk.ijse.springcore.di.PureCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/18/2023
 * Time : 11:31 PM
 */

@Component
public class ConstructorBased {

    @PureCar
    Car car;

    @Autowired
    public ConstructorBased(Car car) {
        this.car = car;
        System.out.println("=========================================================================================");
        System.out.println("Constructor based dependency injected");
        System.out.println("ConstructorBased post constructor : " + car);
        car.drive();
    }
}