package consambig;

public class c1 {
int a,b;

public c1(int a, int b) {
	super();
	System.out.println("executing integers");
	this.a = a;
	this.b = b;
}
public c1(double a, double b) {
	super();
	System.out.println("executing double");
	this.a = (int) a;
	this.b = (int) b;
}
@Override
public String toString() {
	return "c1 [a=" + a + ", b=" + b + "]";
}

}
