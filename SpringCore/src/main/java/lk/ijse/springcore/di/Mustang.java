package lk.ijse.springcore.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/12/2023
 * Time : 3:32 PM
 */

@Component
@Primary
public class Mustang implements Car{
    @Override
    public void drive() {
        System.out.println("Mustang is driving...!");
    }
}
