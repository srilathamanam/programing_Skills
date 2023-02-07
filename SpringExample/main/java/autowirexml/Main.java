package autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("autowirexml/autoxml.xml");
		Employee e=(Employee) ac.getBean("Emp");
		System.out.println(e);
	}

}
