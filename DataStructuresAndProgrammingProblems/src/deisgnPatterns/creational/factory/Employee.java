package deisgnPatterns.creational.factory;

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
