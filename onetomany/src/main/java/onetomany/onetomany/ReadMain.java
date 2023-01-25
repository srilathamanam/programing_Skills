package onetomany.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadMain {

	public static void main(String[] args) {
		getEmployeeAndAdressByAddressId();
	    
	  }

	private static void getEmployeeAndAdressByAddressId() {

		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=s.openSession();
	    	Address address = se.get(Address.class, 1);
	    	System.out.println(address);
	    	if(address != null){
	    		System.out.println(address.getEmployee());
	    	}
	    	System.out.println();
		
	
	}

	private static void getEmployeeAndAdressByEmployeeId() {
		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=s.openSession();
	    	Employee employee2 = se.get(Employee.class , 1);
	    	System.out.println(employee2);
	    	if(employee2 != null){
	    		employee2.getAddressList();
	    		System.out.println(employee2);
	    	}
	    	}
		
	

}
