package heroes;

public abstract class Heroes implements Power {

	public abstract void setHealthy(int healthy);
	public abstract void setMoney(int money);
	public abstract void setDamage(int damage);
	
	
	
	public static void heroMenu() {
		System.out.print("Select your hero !\n  " + "\t\tDamage\tHealty\tMoney\n" + " -1- Samurai\t  4\t  21\t  20\n"
				+ " -2- Archer\t  6\t  18\t  15\n" + " -3- Knight\t  8\t  15\t  10\n\n" + "Your choice : ");
	}

	@Override
	public String toString() {
		return "Created successfully! Name:" + getName() + ", Healthy:" + getHealthy()
				+ ", Damage: " + getDamage() + ", Your money: " + getMoney();
	}

}
