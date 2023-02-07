package Steroex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Steroex.Bird;

public class Main {
	public static void main(String ar[])
	{
	ApplicationContext ap=new ClassPathXmlApplicationContext("Steroex/Sterconfigure.xml");
	Bird b= (Bird) ap.getBean(Bird.class);
	//Bird b= (Bird) ap.getBean("ob",Bird.class);
System.out.println(b);
}
}
