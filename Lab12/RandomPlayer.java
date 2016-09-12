package Lab12;

import java.util.Random;

public class RandomPlayer extends Player {

	public RandomPlayer(String playerName) {
		super(playerName);   

	}

	@Override
	public Roshambo generateRoshambo() {
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;

		switch (answer) {
		case 1:
			System.out.println("RANDOM PLAYER ::" + " Rock");
			return Roshambo.ROCK;

		case 2:
			System.out.println("RANDOM PLAYER ::" + " Paper");
			return Roshambo.PAPER;

		case 3:
			System.out.println("RANDOM PLAYER ::" + " Scissors");
			return Roshambo.SCISSORS;

		default:
			return null;
		}

	}

}
