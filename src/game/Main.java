package game;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		game.login();
		game.selectedHero();
		while (true) {
			game.locationMenu();
			game.selectedLocations();
		}
	}
}
