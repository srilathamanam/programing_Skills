package lifecycleinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean{
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Person [name=" + name + "]";
}

public void destroy() throws Exception {
	System.out.println("destroy");
	
}
public void init()
{
	System.out.println("inside inti");
	
}
public void afterPropertiesSet() throws Exception {
	System.out.println("intialize");
	
}

}
