package lk.ijse.springcore.di.methods;

import lk.ijse.springcore.di.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/18/2023
 * Time : 11:31 PM
 */

@Component
public class PropertyBase {
    @Autowired
    Car car;
    public PropertyBase() {
        System.out.println("=========================================================================================");
        System.out.println("Property base dependency injected");
    }
    @PostConstruct
    public void stop(){
        System.out.println("PropertyBase post constructor : "+ car);
        car.drive();
    }
}
