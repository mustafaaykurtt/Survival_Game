package locations;

import heroes.Heroes;
import monsters.Kraken;
import monsters.Monsters;
import myInventory.MyInventory;

public class Jungle extends WarLoc {

	private Heroes hero;
	private Monsters monster;
	private MyInventory inventory;
	private String prize;
	
	public Jungle (Heroes hero, MyInventory inventory) {
		this.hero = hero;
		this.inventory = inventory;
		monster = new Kraken();
		prize = "wood";
	}
	
	@Override
	public String getName() {
		return "Jungle";
	}
	
	@Override
	public Heroes getHero() {
		return hero;
	}
	
	@Override
	public Monsters getMonster() {
		return monster;
	}
	
	@Override
	public MyInventory getInventory() {
		return inventory;
	}

	@Override
	public String prize() {
		return prize;
	}
}
