package SetterInje;

public class SetterIN {
int a1;
String name1;
public int geta1() {
	return a1;
}
public void seta1(int a1) {
	this.a1 = a1;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
@Override
public String toString() {
	return "SetterIN [a=" + a1 + ", name=" + name1 + "]";
}

}
