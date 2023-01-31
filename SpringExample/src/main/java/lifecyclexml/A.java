package lifecyclexml;

public class A {
int a;

public int geta() {
	return a;
}

public void seta(int a) {
	this.a = a;
}

@Override
public String toString() {
	return "A [a=" + a + "]";
}
public void init()
{
	System.out.println("inside inti");
	
}
public void destroy()
{
	System.out.println("inside destri");
	
}
}
