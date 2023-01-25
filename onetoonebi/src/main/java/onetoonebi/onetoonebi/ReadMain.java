package onetoonebi.onetoonebi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadMain {

	public static void main(String[] args) {
		//getEmployeeAndAdressByEmployeeId();
		getEmployeeAndAdressByAddressId();
	    
	  }

	private static void getEmployeeAndAdressByAddressId() {

		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session se=s.openSession();
	se.beginTransaction();
	    	
	    	Address address = se.get(Address.class, 1);
	    	System.out.println(address);
	    	System.out.println(address.getEmployee());
		} 
	
	

	private static void getEmployeeAndAdressByEmployeeId() {
		Employee employee = null;
		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session se=s.openSession();
	se.beginTransaction();
	    	employee = se.get(Employee.class, 1);
	    	System.out.println(employee);
	    	Address address = employee.getAddress();
	    	System.out.println(address);
		} 
	}


