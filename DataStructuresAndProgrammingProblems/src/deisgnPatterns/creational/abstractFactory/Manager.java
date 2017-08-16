package deisgnPatterns.creational.abstractFactory;

public class Manager extends Employee {

	public Manager(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Manager";
	}

}
