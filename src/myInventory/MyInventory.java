package myInventory;

public class MyInventory {
	private int myArmorVal;
	private StringBuilder myArmorsName;
	private StringBuilder myWeaponName;
	private StringBuilder prize;
	
	public MyInventory() {
		myArmorVal = 0;
		myArmorsName = new StringBuilder();
		myWeaponName = new StringBuilder();
		prize = new StringBuilder();
	}
	
	public int getMyArmorVal() {
		return myArmorVal;
	}

	public void setMyArmorVal(int myArmorVal) {
		this.myArmorVal += myArmorVal;
	}

	public String getMyArmorsName() {
		return myArmorsName.toString();
	}

	public void setMyArmorsName(String myArmorsName) {
		this.myArmorsName.append(myArmorsName);
	}

	public String getMyWeaponName() {
		return myWeaponName.toString();
	}

	public void setMyWeaponName(String myWeaponName) {
		this.myWeaponName.append(myWeaponName);
	}

	public String getPrize() {
		return prize.toString();
	}

	public void setPrize(String prize) {
		this.prize.append(prize);
	}
}
