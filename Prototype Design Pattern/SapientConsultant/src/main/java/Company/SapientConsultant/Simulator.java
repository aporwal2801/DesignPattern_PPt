package Company.SapientConsultant;

public class Simulator {

	public static void main(String[] args) {

		String employeeInfo = CompanyFactory.registerEmployee(1001, "Amit", "Full-Time");
		
		System.out.println(employeeInfo);

	}

}
