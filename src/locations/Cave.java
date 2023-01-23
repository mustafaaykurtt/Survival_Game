package locations;

import heroes.Heroes;
import monsters.*;
import myInventory.MyInventory;

public class Cave extends WarLoc {
	private Heroes hero;
	private Monsters monster;
	private MyInventory inventory;
	private String prize;
	
	public Cave (Heroes hero, MyInventory inventory) {
		this.hero = hero;
		this.inventory = inventory;
		monster = new Goblin();
		prize = "food";
	}
	
	@Override
	public String getName() {
		return "Cave";
	}
	
	@Override
	public Heroes getHero() {
		return hero;
	}
	
	@Override
	public Monsters getMonster() {
		return monster;
	}

	public MyInventory getInventory() {
		return inventory;
	}

	@Override
	public String prize() {
		return prize;
	}
}
