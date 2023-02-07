package removexml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student1 {
@Value("#{abc}")
String name;
@Value("#{10}")
int no;
public String getName() {
	return name;
}

public int getNo() {
	return no;
}


}
