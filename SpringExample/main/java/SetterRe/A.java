package SetterRe;

public class A {
int m;
B b;
public int getm() {
	return m;
}
public void setm(int m) {
	this.m = m;
}
public B getb() {
	return b;
}
public void setb(B b) {
	this.b = b;
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "A [m=" + m + ", B=" + b + "]";
}

}
