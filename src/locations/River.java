package locations;

import heroes.Heroes;
import monsters.Dragon;
import monsters.Monsters;
import myInventory.MyInventory;

public class River extends WarLoc {

	private Heroes hero;
	private Monsters monster;
	private MyInventory inventory;
	private String prize;
	
	public River (Heroes hero, MyInventory inventory) {
		this.hero = hero;
		this.inventory = inventory;
		monster = new Dragon();
		prize = "fire";
	}
	
	@Override
	public String getName() {
		return "River";
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
