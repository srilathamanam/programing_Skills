package lifecycleannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("lifecycleannotation/liaconfigure.xml");
		 ac.registerShutdownHook();
		 Ex e=(Ex) ac.getBean("le");
		 e.toString();

	}

}
