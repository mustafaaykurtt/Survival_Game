package inventory.armors;

public class Skin extends Armors {
	private int money;
	private int block;
	private String name;
	
	public Skin() {
		money = 25;
		block = 4;
		name = "skin";
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
