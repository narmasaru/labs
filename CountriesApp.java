import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BaseBall.BatterClass;

public class CountriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menuNumber;
		String countryInput = "";
		List<String> countries = new ArrayList<>();
		String choice = "yes";

		CountriesTextFile countrytextfile = new CountriesTextFile();
		System.out.println("Welcome to the countries Maintenance Application!");

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println();
			System.out.println("Options To choose");
			System.out.println("1- See the list of countries");
			System.out.println("2- Add a county");
			System.out.println("3- Exit");
			System.out.print("Enter menu number(1,2,3)::");
			menuNumber = sc.nextInt();

			switch (menuNumber) {
			case 1:
				countries = countrytextfile.readCountryList();
				for (String s : countries)
					System.out.println(s);
				break;

			case 2:

				System.out.print("Enter a country name :: ");

				countries.removeAll(countries);
				countryInput = sc.next();
				countries.add(countryInput);

				countrytextfile.writeCountryList(countries);
				
				System.out.println("This Country has been saved"+"\n" );
				
				break;

			case 3:
				System.out.println("Exit");

				break;
			case 4:
				System.out.println("no");
			default:
				System.out.println("Enter a valid input from 1 to 3");

			}
		}

	}

}
