package deisgnPatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonTester {
	public static void main (String args[]){
		SingleInstanceResource res = null;
		//res = res.getInstance(); 
		//i was asked in an interview if we can use a null reference to call a static method.
		// yes it is allowed but result in a compiler warning. Static method should be called in a static way, ie by using the class name.
		
		res = SingleInstanceResource.getInstance();
		System.out.println(res.hashCode());
		
		SingleInstanceResource res2 = null;
		res2 = SingleInstanceResource.getInstance();
		System.out.println(res2.hashCode());
		
		// Breaking the Singleton with reflection.
		
		try {
            Constructor[] constructors = SingleInstanceResource.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                res2 = (SingleInstanceResource) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		// hashcode after creating a new instance;
		System.out.println("breaking the pattern using reflection");
		System.out.println("new instance created:"+res2.hashCode());
	}

}
