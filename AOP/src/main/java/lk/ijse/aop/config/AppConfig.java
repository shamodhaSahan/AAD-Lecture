package lk.ijse.aop.config;

import lk.ijse.aop.AppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 3:43 PM
 */

@Configuration
@ComponentScan(basePackageClasses = {AppInitializer.class})
public class AppConfig {
}
