package locations;

import java.util.Random;
import java.util.Scanner;

import game.Game;
import game.Main;
import heroes.Heroes;
import monsters.Monsters;
import myInventory.MyInventory;

public abstract class WarLoc extends Locations {
	Scanner input = new Scanner(System.in);

	public abstract Heroes getHero();

	public abstract Monsters getMonster();

	public abstract MyInventory getInventory();

	public abstract String prize();

	private int numberOfMonsters = numberOfMonsters();

	public void preWarStatus() {

		System.out.println("\n* Hero States *\n---------------");
		System.out.println(" Name: " + getHero().getName());
		System.out.printf(" Health:%3d\n", getHero().getHealthy());
		System.out.printf(" Damage:%3d\n", getHero().getDamage());
		System.out.printf(" Money:%4d\n\n", getHero().getMoney());

		System.out.println("* Monster States *\n----------------");
		System.out.println(" Name: " + getMonster().getName());
		System.out.printf(" Health:%3d\n", getMonster().getHealthy());
		System.out.printf(" Damage:%3d\n", getMonster().getDamage());
		System.out.printf(" Money:%4d\n\n", getMonster().getMoney());
	}

	public void preWarInfo() {												//information about the monster name and number
		System.out.print(toString() + "\nBe careful!! There are "
				+ (numberOfMonsters == 1 ? numberOfMonsters + " " + getMonster().getName() : numberOfMonsters + " " + getMonster().getName() + "s")
				+ " in the cave!\n" + "<<C>ombat or <R>un ?> : ");
	}

	public void warrior() {													//Battle in 3 locations can be seen in this method.
		int heroHealty = getHero().getHealthy();
		boolean control = true;

		outher: for (int i = 0; i < numberOfMonsters; i++) {

			int monstHealty = getMonster().getHealthy();

			preWarStatus();
			while (monstHealty > 0 && heroHealty > 0) {
				System.out.print("<<H>it or <R>un ?> : ");

				if (!Game.isContinue(input.next(), 'H')) {
					control = false;
					break outher;
				}

				System.out.println("\nYou hit the " + getMonster().getName() + "!");

				monstHealty -= getHero().getDamage();
				
				if (monstHealty < 1) {													//The health of the beast should not fall to negative values.It must die.
					getHero().setHealthy(heroHealty);
					System.out.println("You killed the " + getMonster().getName() + "\n");
					monstHealty = 0;
					break;
				}

				System.out.printf(" Hero health:%6d\n", heroHealty);
				System.out.printf(" Monster health:%3d\n\n", monstHealty);
				System.out.println(getMonster().getName() + " hits you !");

				if (getInventory().getMyArmorVal() >= getMonster().getDamage()) {		//if the armor is greater than the damage, the player's health should not change.


				} else {
					heroHealty -= (getMonster().getDamage() - getInventory().getMyArmorVal());
				}

				if (heroHealty <= 0) {
					System.out.println("     \n********You are dead.Sorry you have to try again...********\n");
					System.out.println("-------------------------------------------\n");
					Main.main(null);														//when the player dies the game ends and starts over

				}

				System.out.printf(" Hero health:%6d\n", heroHealty);
				System.out.printf(" Monster health:%3d\n\n", monstHealty);
			}
		}
		if (control) {															//if the user refuses to fight they should not get the reward and the money
			int heroMoney = getHero().getMoney();
			int monstMoney = getMonster().getMoney();
			
			if (numberOfMonsters == 1) {										//the win depends on the number of monsters killed
				getHero().setMoney(heroMoney + monstMoney);
			} else {
				getHero().setMoney(heroMoney + monstMoney * 2);
			}
			
			System.out.println("Current Money: " + getHero().getMoney());
			
			if (!getInventory().getPrize().contains(prize())) {					//reward can be won once
				getInventory().setPrize(prize());
				System.out.println("Congratulations you won " + prize());
			}
		}
	}

	public static int numberOfMonsters() {
		Random r1 = new Random();
		return r1.nextInt(1, 3);
	}
}
