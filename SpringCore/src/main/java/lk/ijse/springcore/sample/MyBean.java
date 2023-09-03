package lk.ijse.springcore.sample;

import lk.ijse.springcore.lifecycle.LifeCycle;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public MyBean() {
        System.out.println("my bean");
    }

}
