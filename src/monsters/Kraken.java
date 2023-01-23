package monsters;

public class Kraken extends Monsters {
	private String name;
	private int money;
	private int damage;
	private int healthy;
	
	public Kraken() {
		name = "Kraken";
		money = 5;
		damage = 7;
		healthy = 18;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public int getHealthy() {
		return healthy;
	}
}
