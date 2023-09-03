package lk.ijse.springcore.di;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/12/2023
 * Time : 4:22 PM
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PureCar {
}
