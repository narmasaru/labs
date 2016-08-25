

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int lastNumber;
		String choice = "y";
		
		
		
		
		while (choice.equalsIgnoreCase("y")) {
			
			
			System.out.print("Enter a number");
			lastNumber = sc.nextInt();
			System.out.println("Number" + "\t"  + "Sqaure" + "\t"  +  "Cube");
			System.out.println("======" + "\t" + "=======  " + "\t"  +"====== ");	
			
			
			for (int i = 1; i <= lastNumber; i++) {
				
				
				int square =i*i;
				
				int cube =i*i*i;

				
				System.out.println(i + "\t" + square + "\t" + cube);
				
			}
			
			
			
			System.out.println("Do you want to continue: (y/n)");
			choice = sc.next();
			
			

		}
		System.out.println("exit");
		sc.close();
	}

}
