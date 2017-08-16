package deisgnPatterns.creational.factory;

public class Programmer extends Employee {

	public Programmer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Programmer";
	}

}
