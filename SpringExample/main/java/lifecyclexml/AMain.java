package lifecyclexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("lifecyclexml/lxconfigure.xml");
		 ac.registerShutdownHook();
		A a1=(A) ac.getBean("testA");
		System.out.println(a1);

	}

}
