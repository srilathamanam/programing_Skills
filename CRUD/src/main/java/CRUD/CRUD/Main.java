package CRUD.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		SessionFactory s=null;
		s=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se=s.openSession();
		//Transaction t=se.beginTransaction();
		//Integer id=(Integer)se.save(getEmployee());
		//System.out.println("employee created");
		//se.getTransaction().commit();
		createEmployee(se);
	}
		/*private static void deleteEmployeeById(Session session) {
			Employee employee = session.get(Employee.class, 2);
			if(employee != null){
				session.beginTransaction();
				
				session.delete(employee);
				session.getTransaction().commit();
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
		}

		private static void updateEmployeeById(Session session) {
			Employee employee = session.get(Employee.class, 2);
			if(employee != null){
				employee.setSalary(40000.00);
				session.beginTransaction();
				
				session.update(employee);
				session.getTransaction().commit();
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
			
		
		}

		private static void getEmployeebyId(Session session) {
			Employee employee = session.get(Employee.class, 20);
			if(employee != null){
				System.out.println(employee);
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
			
		}*/

		private static void createEmployee(Session session) {
			session.beginTransaction();
			Integer id =(Integer)session.save(getEmployee());
			System.out.println("Employee is created  with Id::"+id);
			session.getTransaction().commit();
		}
		
		private static Employee getEmployee(){
			Employee employee= new Employee();
			employee.setEmployeeName("Martin Bingel");
			employee.setEmail("martin.cs2017@gmail.com");
			employee.setSalary(50000.00);
			
			return employee;
		}
	}


