package lk.ijse.springcore.sample;

import lk.ijse.springcore.ib.Sample;
import lk.ijse.springcore.lifecycle.LifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/19/2023
 * Time : 10:23 AM
 */

@Component
public class LightMode {
    @Bean // light mode
    public Sample sample(LifeCycle lifeCycle) throws Exception {
        System.out.println("sample light mode inter-bean : "+lifeCycle);
        lifeCycle.destroy();
        return new Sample();
    }
}
