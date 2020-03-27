package hibrnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class application {
	
	
	public static void main(String[] args) {
		
		
		
		
		employee emp=new employee();
		
		emp.seteId(101);
		emp.seteName("anonymous");
		emp.seteColor("red");
		
		
		
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(employee.class);
	
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		
		
		
		SessionFactory sf=cfg.buildSessionFactory(sr);
		
		
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
				
				s.save(emp);
		
				t.commit();
				
	}
	
	

}
