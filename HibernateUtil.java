package Com.Soft;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		StandardServiceRegistry ssr = ssrb.applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(ssr);

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
