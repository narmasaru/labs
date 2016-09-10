package Lab12;

import java.util.Scanner;

public class ScannerPlayer extends Player {

	Scanner sc = new Scanner(System.in);

	public ScannerPlayer(String playerName) {
		super(playerName);

	}

	@Override
	public Roshambo generateRoshambo() {

		System.out.println("Pick your choice (Rock,Paper or Scissors):");

		String userInput = sc.next();

		switch (userInput) {
		case "rock":
			return Roshambo.ROCK;
		case "paper":
			return Roshambo.PAPER;
		case "scissors":
			return Roshambo.SCISSORS;
		default:
			return null;
		}

	}

}
