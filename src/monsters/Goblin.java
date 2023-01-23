package monsters;

public class Goblin extends Monsters {
	
	private String name;
	private int money;
	private int damage;
	private int healthy;
	
	public Goblin() {
		name = "Goblin";
		money = 3;
		damage = 8;
		healthy = 10;
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
