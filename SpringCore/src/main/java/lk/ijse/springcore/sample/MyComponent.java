package lk.ijse.springcore.sample;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public MyComponent() {
        System.out.println("my component");
    }
    public void run(){
        System.out.println("thi is my component");
    }
}
