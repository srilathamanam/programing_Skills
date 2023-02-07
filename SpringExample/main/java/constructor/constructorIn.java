package constructor;

public class constructorIn {
int a;
double b;
String s;
test t;
public constructorIn(int a, double b, String s, test t) {
	super();
	this.a = a;
	this.b = b;
	this.s = s;
	this.t=t;
}
@Override
public String toString() {
	return  a +  b +  s + t.toString();
}

}
