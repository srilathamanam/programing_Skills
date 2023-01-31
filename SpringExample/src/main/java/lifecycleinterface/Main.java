package lifecycleinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("lifecycleinterface/liconfigure.xml");
		 ac.registerShutdownHook();
		Person p1=(Person) ac.getBean("li1");
		Person p2=(Person) ac.getBean("li2");
		System.out.println(p1);
		System.out.println(p2);
	}

}
