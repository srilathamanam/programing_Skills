package scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component("od")
@Component
public class Bird {
	@ Value("abc") 
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Bird [name=" + name + "]";
}

}
