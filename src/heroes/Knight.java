package heroes;

public class Knight extends Heroes{
	private String name;
	private int damage;
	private int healthy;
	private int money;
	
	public Knight() {
		name = "Knight";
		damage = 8;
		healthy = 15;
		money = 10;
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
