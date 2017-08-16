package deisgnPatterns.structural.composite.menuItem;

import deisgnPatterns.structural.composite.MenuItem;

public abstract class ChickenItems implements  MenuItem{
	@Override
	public String getDescription() {
		return "Chicken Items:";
	}
	
}
