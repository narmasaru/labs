package Lab12;

import java.util.Scanner;

public class RoshambooGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Player opponent;
		Player user;
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Enter your Name");

		String player = sc.next();
		user = new ScannerPlayer(player);
		String playAgain = "yes";
		int win = 1;
		int tie = 1;
		int lost = 1;

		do {
			try {

				System.out.println("Would you like to play against Random/Rock");
				String userChoice = sc.next();

				switch (userChoice.toLowerCase()) {

				case "random":
					opponent = new RandomPlayer(userChoice);

					break;
				case "rock":
					opponent = new RockPlayer(userChoice);

					break;
				default:
					throw new IllegalArgumentException("Enter a valid input");

				}

				switch (user.generateRoshambo()) {
				case ROCK:

					switch (opponent.generateRoshambo()) {
					case ROCK:
						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + " ROCK");
						System.out.println(player.toUpperCase() + "  Tie! " + tie++);
						break;
					case PAPER:

						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + "ROCK");
						System.out.println(player.toUpperCase() + "  Lost! " + lost++);
						break;
					case SCISSORS:
						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + "ROCK");
						System.out.println(player.toUpperCase() + "  Wins! " + win++);
						break;
					}

					break;
				case PAPER:
					switch (opponent.generateRoshambo()) {

					case ROCK:
						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + " PAPER");
						System.out.println(player.toUpperCase() + "  Wins! " + win++);
						break;
					case PAPER:

						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + " PAPER");
						System.out.println(player.toUpperCase() + "  Tie! " + tie++);
						break;
					case SCISSORS:
						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + " PAPER");
						System.out.println(player.toUpperCase() + "  Lost! " + lost++);
						break;
					}

					break;
				case SCISSORS:
					switch (opponent.generateRoshambo()) {
					case ROCK:
						System.out.println(player.toUpperCase() + "\t" + "PICK" + "::" + " SCISSORS");
						System.out.println(player.toUpperCase() + "  Lost! " + lost++);
						break;
					case PAPER:

						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + " SCISSORS");
						System.out.println(player.toUpperCase() + "  Wins! " + win++);
						break;
					case SCISSORS:
						System.out.println(player.toUpperCase() + "'s" + "\t" + "PICK" + "::" + " SCISSORS");
						System.out.println(player.toUpperCase() + "  Tie! " + tie++);
						break;
					}

					break;

				default:
					throw new NullPointerException("enter valid input");

				}

			} catch (NullPointerException | IllegalArgumentException ex) {
				System.out.println("Enter Valid Input");
			}

			System.out.println("play again?(y/n)");
			playAgain = sc.next();

		} while (playAgain.equalsIgnoreCase("yes"));

		int total = (win - 1) + (lost - 1) + (tie - 1);
		System.out.println("Games Played :: " + total);
		System.out.println("Total Win : " + (win - 1));
		System.out.println("Total Loss : " + (lost - 1));
		System.out.println("Total Tie : " + (tie - 1));

		System.out.println("Good Bye");

		System.out.println("play again?(y/n)");
		playAgain = sc.next();
		sc.close();
	}

}
