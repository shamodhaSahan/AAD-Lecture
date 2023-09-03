package lk.ijse.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 12:32 PM
 */

public class JPAUtil {
    private static final EntityManagerFactory emf = buildEntityManager();

    private static EntityManagerFactory buildEntityManager() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = JPAUtil.class.getResourceAsStream("/application.properties");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            properties.load(bufferedReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Persistence.createEntityManagerFactory("test", properties);
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
