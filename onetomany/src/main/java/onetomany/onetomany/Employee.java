package onetomany.onetomany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="employee_table")
@DynamicUpdate
public class Employee {
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeId;
	
	@Column(name="employee_name",length=200,nullable=false)
	private String employeeName;
	
	@Column(name="email")
	private String email;
	
	
	
	@Column(name="salary")
	private Double salary;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="employee",fetch=FetchType.EAGER)
	private List<Address> addressList = new ArrayList<Address>();
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj="
				 + ", salary=" + salary + "]";
	}
}
