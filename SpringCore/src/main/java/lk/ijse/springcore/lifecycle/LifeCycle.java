package lk.ijse.springcore.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/12/2023
 * Time : 10:43 AM
 */

@Component
//        ("newName")

//@Scope("singleton")
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public LifeCycle() {
        System.out.println("1. Hello LS constructor...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3. bean name is "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. bean factory is "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5. application context is "+applicationContext);
    }

    @PostConstruct
    public void postConstructorMethod(){
        System.out.println("after constructor / before ready...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. i'm ready...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(" after ready / before destroy...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("7. Good Bye LS Bean...");
    }
}
