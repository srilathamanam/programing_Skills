package consambig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructor.constructorIn;

public class CMain {

	public static void main(String[] args) {

			ApplicationContext ac=new ClassPathXmlApplicationContext("consambig/cc.xml");
			c1 c=(c1) ac.getBean("cm");
			System.out.println(c);
			

	}

}
