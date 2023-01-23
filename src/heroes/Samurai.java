package heroes;

public class Samurai extends Heroes {
	private String name;
	private int damage;
	private int healthy;
	private int money;
	
	public Samurai() {
		name = "Samurai";
		damage = 4;
		healthy = 21;
		money = 20;
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
