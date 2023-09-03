package lk.ijse.aop;

import lk.ijse.aop.config.AppConfig;
import lk.ijse.aop.transaction.Transaction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 3:42 PM
 */

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Transaction bean = ctx.getBean(Transaction.class);
        bean.startTransaction();
        bean.endTransaction();
        ctx.close();
    }
}
