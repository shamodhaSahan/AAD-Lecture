package lk.ijse.aop.transaction;

import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 3:37 PM
 */

@Component
public class Transaction {
    public void startTransaction(){
        System.out.println("start transaction..!");
    }

    public void endTransaction(){
        System.out.println("end transaction..!");
    }
}
