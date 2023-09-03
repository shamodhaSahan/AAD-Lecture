package lk.ijse.springcore.config;

import lk.ijse.springcore.lifecycle.LifeCycle;
import lk.ijse.springcore.sample.LightMode;
import lk.ijse.springcore.sample.MyBean;
import lk.ijse.springcore.sample.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {LightMode.class})
@ComponentScan(basePackageClasses = {LifeCycle.class})
public class ApplicationConfig {
    @Bean // full mode
    public MyBean myBean(LifeCycle lifeCycle) throws Exception {
        System.out.println(" my bean full mode inter-bean : "+lifeCycle);
        lifeCycle.destroy();
        return new MyBean();
    }
}
