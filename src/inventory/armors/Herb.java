package inventory.armors;

public class Herb extends Armors{
	private int money;
	private int block;
	private String name;
	
	public Herb() {
		money = 15;
		block = 2;
		name = "herb";
	}
	
	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public int getBlock() {
		return block;
	}

	@Override
	public String getName() {
		return name;
	}
}



