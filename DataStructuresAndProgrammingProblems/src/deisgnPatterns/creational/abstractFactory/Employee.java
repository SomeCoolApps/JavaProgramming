package deisgnPatterns.creational.abstractFactory;

public abstract class Employee {
	String name; 
	int age;
	public abstract String getType();
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" is a "+ getType();
	}
}
