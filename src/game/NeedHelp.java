package game;

import locations.NamesAllGame;

public class NeedHelp implements NamesAllGame {

	@Override
	public String getName() {
		return "Need Help";
	}

	public void info() {
		System.out.println("\n\tThey have sent you to a deserted city to conduct experiments on you."
				+ " To escape, you must fight in some parts of the city and rest in others."
				+ " The places you can go and their features are shown below.");

		System.out.println("\n\tSafe House: Your health is replenished. After collecting food, wood and fire   from the "
				+ "battle locations at the end of the game, you can return to a safe home and finish the game.");
		
		System.out.println("\n\tShop: Sometimes your battles will not be easy. In order to overcome this, you  must acquire weapons "
				+ "and defensive tools and upgrade your hero");
		
		System.out.println("\n\tCave: Here Goblin wait for you.Maybe Goblins:) Food items will drop here..");
		System.out.println("\n\tJungle: Kraken will wait for you here, you can defeat him. Wood item will drop here..!");
		System.out.println("\n\tRiver: Dragon will wait for you here.Fire item will drop here.God be with you..");
		
	}
}