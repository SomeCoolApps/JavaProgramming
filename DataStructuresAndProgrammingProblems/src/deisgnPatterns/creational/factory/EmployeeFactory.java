package deisgnPatterns.creational.factory;

/**
 * 
 * @author home_comp
 * 
 *  *in the factory patter the logic of creating concrete implementations of a given supertype is put into factory layer. 
 *that layer is making the decision of what type of object to create. based on the defined criteria. 
 *in this case the factory decides to create a programmer or a manager based on the input provided to the create method.
 *although this logic is pretty simple and may have been embedded in the client side, 
 *but the creation decision can be complex based on some requirements which the client may not be aware of.
 *in such cases the factory can abstract that logic from the client. 
 **/

public class EmployeeFactory {
	
	
	public Employee createEmployee(String name, int age, EMP_TYPES type ){
		switch(type){
		case MANAGER :
			return new Manager(name,age);
		case PROGRAMMER:
			return new Programmer(name,age);
		}
		return null;
	}
	
	public static void main(String[] args) {
		EmployeeFactory factory = new EmployeeFactory();
		Employee emp1 = factory.createEmployee("Arun", 35, EMP_TYPES.MANAGER);
		Employee emp2 = factory.createEmployee("Ajay", 30, EMP_TYPES.PROGRAMMER);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
