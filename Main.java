package hibernate_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Candidate c1=new Candidate();
		c1.setId(24);
		c1.setAname("Tina");
		c1.setComplgrad(true);
		c1.setComplHSSC(true);
		c1.setComplmaster(true);
		c1.setSports(true);
		c1.calculateTotPoints();
		
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		
//		session.save(c1);
//		
//		session.getTransaction().commit();
//		session.close();
//		sessionFactory.close();
		
	}

}
