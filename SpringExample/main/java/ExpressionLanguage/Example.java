package ExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Example {
@Value("#{22+11}") 
int a;
@Value("#{T(java.lang.Math).sqrt(25)}")
int b;

@Value("#{T(java.lang.Math).PI}") 
private int g;
@Value("#{ new java.lang.String('bitlabs')}") 
private String name;
@Value("#{8>3}")
private boolean var;


public int getA() {
	return a;
}

public int getB() {
	return b;
}

public int getG() {
	return g;
}

public String getName() {
	return name;
}


public boolean isVar() {
	return var;
}

@Override
public String toString() {
	return "Example [a=" + a + ", b=" + b + ", g=" + g + ", name=" + name + ", var=" + var + "]";
}

}
