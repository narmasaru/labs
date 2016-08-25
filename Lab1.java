

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int length = sc .nextInt();
		System.out.println("Enter width");
		int width = sc .nextInt();
		
		int area = width * length ;
		System.out.println("Area = " + area );
		int perimeter = 2 *(length + width);
		System.out.println("Perimeter = " + perimeter );
		
		

	}

}
