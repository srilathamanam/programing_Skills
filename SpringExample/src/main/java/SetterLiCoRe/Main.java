package SetterLiCoRe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SetterInje.SetterIN;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("SetterLiCoRe/dataconfigure.xml");
		Emp o1= (Emp) ap.getBean("ob1");

		System.out.println(o1.getName());
		System.out.println(o1.getAddress());
		System.out.println(o1.getMobile());
		System.out.println(o1.getRole());

	}

}
