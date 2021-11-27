package hw7Q2Encapsulation;

public class Employeeinfo {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setname("Kazi");
		employee.getName();
		employee.setage(30);
		employee.getage();
		employee.setsex('f');
		employee.getsex();
		employee.setusCitizen(true);
		employee.getusCitizen();
	}
}
