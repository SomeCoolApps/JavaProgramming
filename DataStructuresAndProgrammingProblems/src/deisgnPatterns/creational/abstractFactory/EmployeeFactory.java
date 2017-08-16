package deisgnPatterns.creational.abstractFactory;

public class EmployeeFactory {
	
	
	public Employee createEmployee(EmployeeAbstractFactory abstractFactory ){
		return abstractFactory.createEmployee();
	}
	
	public static void main(String[] args) {
		EmployeeFactory factory = new EmployeeFactory();
		ManagerFactory mf = new ManagerFactory("Arun", 35);
		ProgrammerFactory pf = new ProgrammerFactory("Ajay",30);
		Employee emp1 = factory.createEmployee(mf);
		Employee emp2 = factory.createEmployee(pf);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
