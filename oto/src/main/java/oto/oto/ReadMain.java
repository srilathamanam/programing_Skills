package oto.oto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadMain {

	public static void main(String[] args) {
		Employee employee = null;
		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=s.openSession();
	    	employee = se.get(Employee.class, 1);
	    	System.out.println(employee);
	    	Address address = employee.getAddress();
	    	System.out.println(address);
		} 
	    
	  }


