package inventory.weapons;

public class Sword extends Weapons {
	private int money;
	private int damage;
	private String name;
	
	public Sword() {
		this.name = "Sword";
		this.money = 25;
		this.damage = 2;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int money() {
		return money;
	}

	@Override
	public int damage() {
		return damage;
	}}
