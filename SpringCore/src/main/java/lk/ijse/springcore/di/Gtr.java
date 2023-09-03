package lk.ijse.springcore.di;

import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/12/2023
 * Time : 3:47 PM
 */

@Component // gtr
//@Qualifier("g")
@PureCar
public class Gtr implements Car{//gtr
    @Override
    public void drive() {
        System.out.println("Gtr is driving...!");
    }
}
