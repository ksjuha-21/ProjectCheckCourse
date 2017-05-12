package ok_laba9;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by toshiba_admin on 06.05.2017.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creating failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
