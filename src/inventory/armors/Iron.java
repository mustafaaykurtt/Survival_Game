package inventory.armors;

public class Iron extends Armors {
	private int money;
	private int block;
	private String name;
	
	public Iron() {
		money = 35;
		block = 7;
		name = "iron";
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
