package lk.ijse.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 7/29/2023
 * Time : 1:05 PM
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring.api")
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("hello app config...");
    }
}
