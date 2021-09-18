package Com.Soft;

import org.hibernate.*;

public class App {

	public static void main(String[] args) {

		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session s = sf.openSession();
			tx = s.beginTransaction();
			Employee employee = new Employee("Ramesh Kumar", "Male", "Karnattaka", "Bengaluru", 1000);
			s.save(employee);
			tx.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
