package removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(Student1Configuration.class);
		Student1 s=ac.getBean("getStudent",Student1.class);
		System.out.println(s.getName());
		System.out.println(s.getNo());
	}

}
