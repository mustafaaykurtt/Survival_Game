package heroes;

public class Archer extends Heroes {
	private String name;
	private int damage;
	private int healthy;
	private int money;
	
	public Archer() {
		name = "Archer";
		damage = 6;
		healthy = 18;
		money = 15;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public int getHealthy() {
		return healthy;
	}

	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	@Override
	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
