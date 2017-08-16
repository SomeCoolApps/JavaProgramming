package deisgnPatterns.structural.composite;

/**
 * the composite pattern is used when we want to be able to process different items in the same way. 
 * this gives us the ability to handle the different objects as same and also allows for an item to be composed of other similar items. 
 */

import java.util.*;

import deisgnPatterns.structural.composite.menuItem.ChickenBurger;
import deisgnPatterns.structural.composite.menuItem.Coffee;
import deisgnPatterns.structural.composite.menuItem.GarlicBread;
import deisgnPatterns.structural.composite.menuItem.IceCream;
import deisgnPatterns.structural.composite.menuItem.Waffle;

public class Menu implements MenuItem {
	
	static int calls = 0;
	List<MenuItem> menu = new ArrayList<MenuItem>();
	String name;
	
	public Menu(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(MenuItem item) {
		menu.add(item);
	}

	public void remove(MenuItem item) {
		if (menu.contains(item)) {
			menu.remove(item);
		}
	}

	@Override
	public String getDescription() {
		calls++;
		
		String output =  "+"+name ;
		for (MenuItem menuItem : menu) {
			output = output + "\n"+ printTabs(calls) + menuItem.getDescription()+" ";
		}
		calls--;
		return output;
	}

	private String printTabs(int calls2) {
		String s ="";
		for(int i =0 ;i < calls2;i++)s=s+"\t";
		return s+">";
	}

	public static void main(String[] args) {

		IceCream ice = new IceCream();
		Menu menu = new Menu("Restraunt Menu");
		menu.add(new ChickenBurger());
		menu.add(ice);
		menu.add(new GarlicBread());
		
		Menu dinnerPackage = new Menu("Dinner Package");
		dinnerPackage.add(new ChickenBurger());
		dinnerPackage.add(ice);
		
		Menu breakfast = new Menu("BreakFast");
		breakfast.add(new Waffle());
		breakfast.add(new Coffee());
		breakfast.add(new IceCream());
		
		menu.add(breakfast);
		menu.add(dinnerPackage);

		System.out.println(menu.getDescription());
		
	
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
