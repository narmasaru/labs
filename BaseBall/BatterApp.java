package BaseBall;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BatterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String playerName = "";
		int basesEarned = 0;
		int hits = 0;
		String choice = "yes";
		String anotherAtBat = "yes";
		ArrayList<Integer> listOfAtBat = new ArrayList<>();
		BatterClass batter = new BatterClass(playerName);

		System.out.println("Welcome To Batting Average Calculator");
		while (choice.equalsIgnoreCase("yes")) {
			
				System.out.print("Enter Player name :: ");
				playerName = sc.next();
				
			    System.out.println("0=out, 1=Single, 2=double,3=triple,4=homerun");
			do {
				try {

					System.out.print("Another at-bat ::");
					basesEarned = sc.nextInt();
					if (basesEarned < 0 || basesEarned > 4) {
						throw new IllegalArgumentException("Enter number between 0 and 4");

					}
					listOfAtBat.add(basesEarned);
					System.out.print("Enter another At Bat(yes/no)");
					anotherAtBat = sc.next();
					if (!anotherAtBat.equalsIgnoreCase("yes")) {
						throw new IllegalArgumentException ("Enter (yes/no)");
					}
					

				} catch ( IllegalArgumentException ex) {
					System.out.println(ex.getMessage());
				}
			} while (anotherAtBat.equalsIgnoreCase("yes"));
			ArrayList<BatterClass> batterList = new ArrayList<>();

			batterList.add(new BatterClass(playerName));

			batter.setBasesEarned(listOfAtBat);
			String average = batter.getFormatedBattingAverage();
			String sluggingPercent = batter.getFormatedSluggingPercentage();
			System.out.println("Player Name: " + batter.getPlayerName());
			System.out.println("Batting Average: " + average);
			System.out.println("Slugging Percentage: " + sluggingPercent);

			System.out.print("Another Batter? (yes/no) :");
			choice = sc.next();
			
			

		}
         System.out.println("GoodBye");
	}

}
