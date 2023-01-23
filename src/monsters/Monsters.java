package monsters;

import java.util.Random;

import heroes.Power;

public abstract class Monsters implements Power {
	
	public static int numberOfMonsters() {
		Random r1 = new Random();
		return r1.nextInt(1, 3);
	}
}
