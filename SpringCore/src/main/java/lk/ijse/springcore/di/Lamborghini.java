package lk.ijse.springcore.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/12/2023
 * Time : 4:08 PM
 */

@Component
@Qualifier("g")
public class Lamborghini implements Car{
    @Override
    public void drive() {
        System.out.println("Lamborghini is driving...!");
    }
}
