package deisgnPatterns.creational.abstractFactory;

/**
 * 
 * @author home_comp
 * 
 *The problem with Factory pattern is that the factory method does have the logic of handling object creation. 
 *if lets say we need to add another employee type them along with creating the new class we will also have to modify the factory method logic.
 *this may not be feasible in some situations as we may not want to give the access to the factory class for enhancement. 
 *for such cases we use abstract factory pattern where each class type also provided a factory which has the logic for object creation enclosed in that.
 * so in this case each Employee type will supply a factory class with the object creation logic embedded in that factory. 
 * and the main factory class will only handle delegating to the particular object factory.
 

 */

public interface EmployeeAbstractFactory {
	public Employee createEmployee();	


}
