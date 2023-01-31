package StandList;

import java.util.List;

public class Fruit {
 List<String> name;

public List<String> getName() {
	return name;
}

public void setName(List<String> name) {
	this.name = name;
}

@Override
public String toString() {
	return "Fruit [name=" + name + "]";
}

}
