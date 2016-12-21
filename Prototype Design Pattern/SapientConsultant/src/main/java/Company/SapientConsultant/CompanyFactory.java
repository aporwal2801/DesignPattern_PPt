package Company.SapientConsultant;

public class CompanyFactory extends Prototype {
	
	
	private static java.util.Map<String , Prototype> employeePrototype = new java.util.HashMap<String , Prototype>();
	
	static {
		employeePrototype.put("Employee", new Employee());
		employeePrototype.put("Department", new Department(1001, "Sapient"));	
	}

	public static Prototype getPrototype(String type){
		
		Prototype prototype = employeePrototype.get(type);
		if(prototype != null){
			try {
				return (Prototype)prototype.clone();
				
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	
	public static String registerEmployee(int id, String name, String jobType){	
		
		Employee employeeType = (Employee)getPrototype("Employee");
		Department deptType = (Department)getPrototype("Department");
		if(employeeType !=null){
			employeeType.setEmpId(id);
			employeeType.setEmpName(name);
			employeeType.setType(jobType);
			employeeType.setDept(deptType);	
			
			return employeeType.toString();
		}		
		return null;
		
	}
}
