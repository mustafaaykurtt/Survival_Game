package locations;

import game.Game;
import heroes.Heroes;
import inventory.armors.Armors;
import inventory.armors.Herb;
import inventory.armors.Iron;
import inventory.armors.Skin;
import inventory.weapons.Gun;
import inventory.weapons.Rifle;
import inventory.weapons.Sword;
import inventory.weapons.Weapons;
import myInventory.MyInventory;

public class Shop extends Locations {
	private Game game;
	Weapons weapon;
	Heroes hero;
	Armors arm;
	MyInventory inventory;

	public Shop(Heroes hero, MyInventory inventory) {
		this.hero = hero;
		this.inventory = inventory;
		game = new Game();
	}

	public void info() {
		System.out.println("Welcome to shop !\nWhat do you want to purchase?\n");
		System.out.print(" -1- Weapon\n -2- Armors\n -3- Cancel\n\nYour choice : ");
	}

	public void selectBuy() {
		int choice = game.select(0, 4);

		switch (choice) {
		
		case 1: {				//if weapons are chosen

			System.out.println("\n -1- Sword << Price: 25 -- Damage: +2 >>");
			System.out.println(" -2- Gun   << Price: 34 -- Damage: +4 >>");
			System.out.println(" -3- Rifle << Price: 45 -- Damage: +7 >>");
			System.out.println(" -4- Cancel\n");
			System.out.print("Your choice: ");
			
			choice = game.select(0, 5);
			switch (choice) {
			
			case 1:		
				
				weapon = new Sword();
				if (inventory.getMyWeaponName().contains(weapon.getName())) {
					System.out.println("You already have leather armor!");
					break;
				}

				if (hero.getMoney() < weapon.money()) {
					System.out.println("Sorry you don't have enough money. Keep fighting !!");
					break;
				}

				boughtWeapon();
				break;
				
			case 2:
				
				weapon = new Gun();
				if (inventory.getMyWeaponName().contains(weapon.getName())) {
					System.out.println("You already have leather armor!");
					break;
				}

				if (hero.getMoney() < weapon.money()) {
					System.out.println("Sorry you don't have enough money. Keep fighting !!");
					break;
				}

				boughtWeapon();
				break;
				
			case 3:
				
				weapon = new Rifle();
				if (inventory.getMyWeaponName().contains(weapon.getName())) {
					System.out.println("You already have leather armor!");
					break;
				}

				if (hero.getMoney() < weapon.money()) {
					System.out.println("Sorry you don't have enough money. Keep fighting !!");
					break;
				}

				boughtWeapon();
				break;
				
			case 4:
				
				break;
				
			}
			
			break;
		}
		
		case 2: {					//if armors are chosen
			
			System.out.println("\n -1- Herb << Price: 15 -- Block: +2 >>");
			System.out.println(" -2- Skin << Price: 25 -- Block: +4 >>");
			System.out.println(" -3- Iron << Price: 35 -- Block: +7 >>");
			System.out.println(" -4- Cancel\n");
			System.out.print("Your choice: ");

			choice = game.select(0, 5);
			switch (choice) {
			case 1: {
				arm = new Herb();
				
				if (inventory.getMyArmorsName().contains(arm.getName())) {			//if already exists the user cannot retrieve it again
					System.out.println("You already have leather armor!");
					break;
				}

				if (hero.getMoney() < arm.getMoney()) {											//if the user's money is not enough to buy the item, cannot buy it
					System.out.println("Sorry you don't have enough money. Keep fighting !!");
					break;
				}

				boughtArmor();
				break;
			}
			case 2: {
				arm = new Skin();

				if (inventory.getMyArmorsName().contains(arm.getName())) {
					System.out.println("You already have leather armor!");
					break;
				}

				if (hero.getMoney() < arm.getMoney()) {
					System.out.println("Sorry you don't have enough money. Keep fighting !!");
					break;
				}

				boughtArmor();
				break;
			}

			case 3: {
				arm = new Iron();

				if (inventory.getMyArmorsName().contains(arm.getName())) {
					System.out.println("You already have leather armor!");
					break;
				}

				if (hero.getMoney() < arm.getMoney()) {
					System.out.println("Sorry you don't have enough money. Keep fighting !!");
					break;
				}

				boughtArmor();
				break;
			}
			case 4:
				break;
			}
			break;
		}
		case 3:
			break;
		}
	}

	private void boughtWeapon() {
		inventory.setMyWeaponName(weapon.getName());
		hero.setMoney(hero.getMoney() - weapon.money());
		hero.setDamage(hero.getDamage() + weapon.damage());
		System.out.println("Congratulations, you now have a " + weapon.getName());
	}
																						//Changes are made to MyInventory for armors and weapons.
	private void boughtArmor() {
		hero.setMoney(hero.getMoney() - arm.getMoney());
		inventory.setMyArmorsName(arm.getName());
		inventory.setMyArmorVal(inventory.getMyArmorVal() + arm.getBlock());
		System.out.println("Now you have " + arm.getName() + " armor!!");
	}

	@Override
	public String getName() {
		return "Shop";
	}
}
