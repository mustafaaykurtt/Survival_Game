package inventory.weapons;

public class Gun extends Weapons {
	private int money;
	private int damage;
	private String name;
	
	public Gun() {
		this.name = "Gun";
		this.money = 34;
		this.damage = 4;
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
	}
}
