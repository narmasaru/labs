import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Write this code. You will have a loop and call translateWord
		// from here.

		Scanner sc = new Scanner(System.in);
		String latinWord1;
		String yesorno = "y";
		do {
			System.out.println("Welcome to the Pig Latin Translator");
			System.out.println("Enter a line to be translated");
			String englishWord = sc.nextLine();
			String pigLatinWord = translateWord(englishWord);
			System.out.println(pigLatinWord);
			System.out.println("Do you want to continue (y/n)");
			yesorno = sc.nextLine();
		} while (yesorno.equalsIgnoreCase("y"));

	}

	/**
	 * This method takes any single English word and translates it to a Pig
	 * Latin word.
	 */
	public static String translateWord(String englishWord) {
		String latinWord = "";

		latinWord = englishWord.toLowerCase();
		char checkVowel = latinWord.charAt(0);

		
		
		if (checkVowel == 'a' || checkVowel == 'e' || checkVowel == 'i' || checkVowel == 'o' || checkVowel == 'u') {
			latinWord = latinWord.concat("way");

		} else {

			
			
			
			for (int i = 0; i < latinWord.length(); i++) {
				char x = latinWord.charAt(i);
				if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
					latinWord = latinWord.substring(i) + latinWord.substring(0, i) + "ay";
					break;
				}
			}

		}
		
		return latinWord;
	}

}
