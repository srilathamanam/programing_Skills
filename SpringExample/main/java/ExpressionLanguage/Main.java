package ExpressionLanguage;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("ExpressionLanguage/elconfigure.xml");
		Example e= (Example) ac.getBean(Example.class);
		 //e.toString();
		System.out.println(e);
		e.toString();
	}

}
