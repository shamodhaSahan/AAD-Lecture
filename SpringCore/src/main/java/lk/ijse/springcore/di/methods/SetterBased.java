package lk.ijse.springcore.di.methods;

import lk.ijse.springcore.di.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/18/2023
 * Time : 11:31 PM
 */

@Component
public class SetterBased {
    Car car;
    @Autowired
    public void setInjection(Car car) {
        this.car = car;
        System.out.println("Injected : "+ car);
    }
    public SetterBased() {
        System.out.println("=========================================================================================");
        System.out.println("Setter based dependency injected");
    }
    @PostConstruct
    public void stop(){
        System.out.println("SetterBased post constructor ");
        car.drive();
    }
}