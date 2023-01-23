package inventory.weapons;

public class Rifle extends Weapons {
	private int money;
	private int damage;
	private String name;

	public Rifle() {
		this.name = "Rifle";
		this.money = 45;
		this.damage = 7;
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
