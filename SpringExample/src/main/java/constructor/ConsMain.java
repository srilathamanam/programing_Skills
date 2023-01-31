package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lifecyclexml.A;

public class ConsMain {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("constructor/conconfigure.xml");
		constructorIn ci=(constructorIn) ac.getBean("cons");
		System.out.println(ci);

	}

}
