package onetomany.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreMain {

	public static void main(String[] args) {
		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=s.openSession();
		se.beginTransaction();
    	Employee employee= new Employee();
		employee.setEmployeeName("Barry Bingel");
		employee.setEmail("barry.cs2017@gmail.com");
		employee.setSalary(50000.00);
		
		
		Address address1 = new Address();
		address1.setCity("Chennai");
		address1.setPincode(9087727L);
		address1.setState("Tamilnadu");
		address1.setStreet("Park Street");
		
		Address address2 = new Address();
		address2.setCity("Pube");
		address2.setPincode(9000027L);
		address2.setState("MH");
		address2.setStreet("XYZ Street");
		
		employee.getAddressList().add(address1);
		employee.getAddressList().add(address2);
		
		address1.setEmployee(employee);
		address2.setEmployee(employee);
		
		se.persist(employee);
		
		se.getTransaction().commit();

	}

}
