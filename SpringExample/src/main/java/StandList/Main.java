package StandList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("StandList/Listconfigure.xml");
	Fruit fr=(Fruit) ap.getBean("fr");
	System.out.println(fr);
	}

}
