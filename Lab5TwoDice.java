

import java.util.Random;
import java.util.Scanner;

public class Lab5TwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To the Grand Circus Casino");
		String choice;
		do {
			System.out.println("How many sides should each dice have");
			int sideNumber;

			sideNumber = sc.nextInt();

			System.out.println("Rool the dice");

			int diceOutCome = rollADice(sideNumber);
			int diceOutCome2 = rollADice2(sideNumber);


			System.out.println("Roll");
			System.out.println("=====");
			System.out.println(+diceOutCome);
			System.out.println(+diceOutCome2);


			System.out.println("Do you want to continue: (y/n)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));
		sc.close();
	}

	public static int rollADice(int numberOfSides) {

		int outPut = (int) (Math.random() * numberOfSides + 1);

		return outPut;
		
	}
	
	public static int rollADice2(int numberOfSides) {

		int outPut = (int) (Math.random() * numberOfSides + 1);

		return outPut;
	}
	
}
