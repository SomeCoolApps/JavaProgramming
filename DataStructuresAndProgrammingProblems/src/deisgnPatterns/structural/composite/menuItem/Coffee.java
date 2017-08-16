package deisgnPatterns.structural.composite.menuItem;

import deisgnPatterns.structural.composite.MenuItem;

public class Coffee implements MenuItem {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Coffee";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
