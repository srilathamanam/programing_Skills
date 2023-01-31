package lifecycleannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ex {
int a;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

@Override
public String toString() {
	return "Ex [a=" + a + "]";
}
@PostConstruct
public void start()
{
	System.out.println("before");
}
@PreDestroy
public void end()
{
	System.out.println("after");
}
public Ex() {
	super();
	// TODO Auto-generated constructor stub
}

}
