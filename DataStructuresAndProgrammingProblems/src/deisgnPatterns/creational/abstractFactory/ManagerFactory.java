package deisgnPatterns.creational.abstractFactory;

public class ManagerFactory implements EmployeeAbstractFactory {
	String name;
	int age;
	
	public ManagerFactory(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Manager(name, age);
	}

}
