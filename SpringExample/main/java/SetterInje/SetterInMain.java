package SetterInje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lifecyclexml.A;

public class SetterInMain {

	public static void main(String[] args) {

			ApplicationContext ap=new ClassPathXmlApplicationContext("SetterInje/SIconfigure.xml");
			SetterIN o1= (SetterIN) ap.getBean("SeIn1");
			System.out.println(o1);
			SetterIN o2= (SetterIN) ap.getBean("SeIn2");
			System.out.println(o2);
			SetterIN o3= (SetterIN) ap.getBean("SeIn3");
			System.out.println(o3);


	}

}
