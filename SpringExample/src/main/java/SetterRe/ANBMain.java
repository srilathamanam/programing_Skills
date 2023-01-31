package SetterRe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SetterLiCoRe.Emp;

public class ANBMain {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("SetterRe/Reconfigure.xml");
		B b1= (B) ap.getBean("br");
		A a1= (A) ap.getBean("ar");
		System.out.println(b1.getn());
		System.out.println(a1.getm());
		System.out.println(a1.getb().getn());

	}

}
