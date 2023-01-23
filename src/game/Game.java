package game;

import java.util.InputMismatchException;
import java.util.Scanner;

import heroes.*;
import locations.*;
import myInventory.MyInventory;
import player.Player;

public class Game {
	private Scanner input;
	private Heroes hero;
	private Locations locations; 
	private Player player;
	private MyInventory inventory;
	private NeedHelp need;
	private int firstHealthy;

	public Game() {
		input = new Scanner(System.in);
		inventory = new MyInventory();
	}

	public void login() {
		System.out.print("Please enter your username: ");
		player = new Player(input.next());
		player.playMenu();
		Heroes.heroMenu();
	}

	public Heroes selectedHero() {
		int choice = select(0, 4);

		switch (choice) {
		case 1:
			hero = new Samurai();
			break;

		case 2:
			hero = new Archer();
			break;

		case 3:
			hero = new Knight();
			break;
		}
		System.out.println(hero.toString());
		firstHealthy = hero.getHealthy();			//First health saved when character is selected. To be used in the safe house.
		
		return hero;
	}
	
	public void locationMenu() {
		System.out.print("\nPlease select the location you want to go...\n" +
				   " -1- Safe House \n" + 
				   " -2- Shop\n" +
				   " -3- Cave\n" +
				   " -4- Jungle\n" +
				   " -5- River\n" +
				   " -6- Need Help?\n\n" +
				   "Your choice : ");
	}
																	 
	public Locations selectedLocations() {							
		int choice = select(0, 7);
		switch (choice) {
		
		case 1:
			
			locations = new SafeHouse(hero, firstHealthy);
			SafeHouse safe = (SafeHouse)locations;
			if(safe.controlFinished(inventory)) {
				System.out.println("Congratulations you won the game!\n");
				Main.main(null);												
			}
			System.out.println(locations.toString() + "\nYou are healed. Current healthy:" + safe.upturn());
			break;

		case 2:
			
			locations = new Shop(hero, inventory);
			Shop shop = (Shop) locations;
			shop.info();
			shop.selectBuy();
			break;
			
		case 3:
			
			locations = new Cave(hero, inventory);
			WarLoc cave = (WarLoc)locations;
			cave.preWarInfo();
			if (!isContinue(input.next(), 'C')) {
				break;
			}
			
			cave.warrior();
			
			break;
			
		case 4:
			
			locations = new Jungle(hero, inventory);
			WarLoc jungle = (WarLoc)locations;
			jungle.preWarInfo();
			if (!isContinue(input.next(), 'C')) {
				break;
			}
			
			jungle.warrior();
			break;
			
		case 5:
			
			locations = new River(hero, inventory);
			WarLoc river = (WarLoc)locations;
			river.preWarInfo();
			
			if (!isContinue(input.next(), 'C')) {
				break;
			}
			river.warrior();
			break;
			
		case 6:
			
			need = new NeedHelp();
			need.info();
			
		}
		
		return locations;
	}
	
	public int select(int lower, int upper) {	// // so all methods can select and check
		while (true) {
			try {
				return choiceControl(lower, upper);
			} catch (InputMismatchException e) {
				System.out.print("Please enter a valid value:");
				input.nextLine();
			}
		}
	}

	private int choiceControl(int lower, int upper) throws InputMismatchException {		//User must enter desired value
		int choice;
		while (true) {
			choice = input.nextInt();
			if (lower < choice && choice < upper) {
				break;
			} else {
				System.out.println("Please enter a number between " + (lower + 1) + " and " + (upper - 1));
			}
		}
		return choice;
	}
	
	public static boolean isContinue(String str, char ch) {		//Check the (Combat or Run) and (Hits or Run) 
		if (str.toUpperCase().charAt(0) == ch) {
			return true;
		} 
		return false;
	}
	
}
