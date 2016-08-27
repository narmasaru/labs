

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the factorial calculator");

		Scanner sc = new Scanner(System.in);
		
		int n;
		long ans;
		String choice="y";
		
		while (choice.equalsIgnoreCase("y")) {

		System.out.println("Enter an Integer that is greater than 0 but less than 20:  ");

		n = sc.nextInt();
		ans = fact(n);
		System.out.println("The factorial of  " +n   +"  is "  +ans);
		System.out.println("continue? (y/n)");
		choice=sc.next();
		
		}
		
			
		}

	public static long fact(int n)
	
	{
		if(n == 1)
			return n;
		else
		
		return n * fact(n-1);
		
		
		}
		

	
}
	

	
	

	
	
	
	
	


