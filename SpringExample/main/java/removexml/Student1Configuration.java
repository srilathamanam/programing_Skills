package removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="removexml")
public class Student1Configuration {
	@Bean
	// use this if you dont use @Component in bean class
	public Student1 getStudent()
	{
	Student1 s=new Student1();
	return s;

	}

}
