package deisgnPatterns.creational.singleton;
/**
 * 
 * @author home_comp
 * 
 * There are many ways to initalize the instance in the singleton pattern 
 * 1. Eager Initialization : in this the instance is actually initialized in the declaration itself 
 * 		private static SingleInstanceResource instance = new SingleInstanceResource()
 * 2. Static initialization: the instance variable is intialize inside a static block
 * 3. Lazy Initialization: in this we initialze the varibale inside the getInstance method. 
 * 4. Thread safe Lazy initialization : the block creating the instance is synchronized. [implemented below.]
 * 5. Bill Pugh Singleton Implementation : creating the varible in an inner class. read more about it
 * 
 * 
 */
public class SingleInstanceResource {
	private SingleInstanceResource(){}
	private static SingleInstanceResource instance = null;
	
	public static SingleInstanceResource getInstance(){
		if (instance == null ){
			synchronized (SingleInstanceResource.class) {
				instance = new SingleInstanceResource();
			}
			
		}
		return instance;
	}
	
	
}
