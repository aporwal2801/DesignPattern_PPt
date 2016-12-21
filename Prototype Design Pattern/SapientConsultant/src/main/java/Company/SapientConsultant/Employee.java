package Company.SapientConsultant;

public class Employee extends Prototype {
	
	int empId;
	String empName;
	String type;
	Department dept;
	
	public Employee(){
		
	}
	
	public Employee(int empId, String empName, String type, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.type = type;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee empId=" + empId + ", empName=" + empName + ", type="
				+ type + ", dept=" + dept ;
	}

}
