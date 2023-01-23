package player;

public class Player {
	private String username;
	
	public Player(String username) {
		this.username = username;
	}
	
	public void playMenu() {
		System.out.println("Welcome the game " + getUsername() + ".Are you ready?..\n");
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
