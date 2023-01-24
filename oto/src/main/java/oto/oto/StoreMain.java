package oto.oto;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StoreMain {

	public static void main(String[] args) {
		 
		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=s.openSession();
		    	createEmployee(se);
			
		  }

		private static void createEmployee(Session session) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getEmployee());
			System.out.println("Employee is created  with Id::"+id);
			session.getTransaction().commit();
			
		}
		
		private static Employee getEmployee(){
			Employee employee= new Employee();
			employee.setEmployeeName("Barry Bingel");
			employee.setEmail("barry.cs2017@gmail.com");
			employee.setSalary(50000.00);
			
			
			Address address1 = new Address();
			address1.setCity("Chennai");
			address1.setPincode(9087727L);
			address1.setState("Tamilnadu");
			address1.setStreet("Park Street");
			
			employee.setAddress(address1);
			
			return employee;
		}

}
