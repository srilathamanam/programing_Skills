package autowirexml;

public class Address {
int hno;
String city;
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", city=" + city + "]";
}

}
