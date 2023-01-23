package locations;

public abstract class Locations implements NamesAllGame {
	
	@Override
	public String toString() {
		return "You are in the " + getName() + ".";
	}
}
