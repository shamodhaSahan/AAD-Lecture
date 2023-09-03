package lk.ijse.aop.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 3:34 PM
 */

@Component
@Aspect
@EnableAspectJAutoProxy
public class Log {
    @Before("execution(void startTransaction())")
    void startLog(){
        System.out.println("start log..!");
    }

    @After("execution(void endTransaction())")
    void endLog(){
        System.out.println("end log..!");
    }
}
