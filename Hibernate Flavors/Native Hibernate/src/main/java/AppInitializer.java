import lk.ijse.nativeHibernate.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 12:14 PM
 */

public class AppInitializer {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println(session);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
