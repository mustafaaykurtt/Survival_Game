package locations;

import heroes.Heroes;
import myInventory.MyInventory;

public class SafeHouse extends Locations {
	private Heroes hero;
	private int firstHealthy;
	
	public SafeHouse(Heroes hero, int firstHealthy) {
		this.hero = hero;
		this.firstHealthy = firstHealthy;
		
	}
	
	public int upturn() {
		 hero.setHealthy(firstHealthy);
		 return hero.getHealthy();
	}
	

	@Override
	public String getName() {
		return "Safe House";
	}
	
	public boolean controlFinished(MyInventory inventory) {
		if (inventory.getPrize().contains("foodwoodfire")) {
			return true;
		}
		return false;
	}
}
