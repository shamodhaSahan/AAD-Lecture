import lk.ijse.jpa.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 12:31 PM
 */

public class AppInitializer {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory = JPAUtil.getEmf();
            EntityManager entityManager = entityManagerFactory.createEntityManager();
//            entityManager.getReference(String.class,""); - get ( Eger fetching )
//            entityManager.find(String.class,""); - get ( Lazy fetching )
            System.out.println(entityManager);
        }   catch (Exception e){
            e.printStackTrace();
        }
    }
}
