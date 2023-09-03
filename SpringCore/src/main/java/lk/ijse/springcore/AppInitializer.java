package lk.ijse.springcore;

import lk.ijse.springcore.config.ApplicationConfig;
import lk.ijse.springcore.lifecycle.LifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ApplicationConfig.class);
        ctx.refresh();
//        LifeCycle lifeCycle1 = (LifeCycle) ctx.getBean("newName");
//        LifeCycle lifeCycle2 = (LifeCycle) ctx.getBean("newName");
//        System.out.println("lifeCycle1 : "+lifeCycle1);
//        System.out.println("lifeCycle2 : "+lifeCycle2);

        ctx.registerShutdownHook();
    }
}
