package monsters;

public class Dragon extends Monsters {
	private String name;
	private int money;
	private int damage;
	private int healthy;
	
	public Dragon() {
		name = "Dragon";
		money = 18;
		damage = 10;
		healthy = 20;
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
