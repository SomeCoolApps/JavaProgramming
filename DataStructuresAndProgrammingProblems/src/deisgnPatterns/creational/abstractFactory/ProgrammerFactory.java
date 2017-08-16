package deisgnPatterns.creational.abstractFactory;

public class ProgrammerFactory implements EmployeeAbstractFactory {

	String name;
	int age;
	
	public ProgrammerFactory(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Programmer(name, age);
	}

}
