import java.util.Scanner;

public class MenuDrivenNumberOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the number menu");
		System.out.println("Number menu has 6 options to chose");
		System.out.println("option 1 is add three numbers");
		System.out.println("option2 is finding largest of 5 numbers");
		System.out.println("option3 is finding the sum of first 100 numbers");
		System.out.println("option4 is swapping two numbers");
		System.out.println("option5 is finding fibonacci of any given number");
		System.out.println("print star for given value");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Chose the option");
			sc = new Scanner(System.in);
			int option = sc.nextInt();
			

			switch (option) {
			case 1:

				System.out.println("Enter three numbers");

				int x, y, z;
				x = sc.nextInt();
				y = sc.nextInt();
				z = sc.nextInt();
				int result = add(x, y, z);
				System.out.println("The sum of three numbers is:   " + result);
				break;
			case 2:
				System.out.println("Enter five Integers");

				int n1, n2, n3, n4, n5;

				n1 = sc.nextInt();
				n2 = sc.nextInt();
				n3 = sc.nextInt();
				n4 = sc.nextInt();
				n5 = sc.nextInt();
				int largest = largestNumber(n1, n2, n3, n4, n5);

				System.out.println("The largerst of five numbers is:   " + largest);
				break;
			case 3:
				System.out.println("Find sum of first 100 number");
				int a = 0;

				for (int i = 1; i <= 100; i++) {

					a = a + i;
				}

				System.out.println("Sum of first 100 numbers is:   " + a);
				break;
			case 4:
				System.out.println("Enter two numbers to swap");
				int a1 = sc.nextInt();
				int b = sc.nextInt();
				int z1;
				System.out.println("Before swapping " + a1 + "\t" + b);
				z1 = a1;
				a1 = b;
				b = z1;
				System.out.println("After swapping  " + a1 + "\t" + b);
				break;

			case 5:
				System.out.print("Enter number: ");
				int ent = sc.nextInt();

				int num1 = 0;
				int num2 = 1;
				int num3 = 0;

				for (int a2 = 0; a2 < ent; a2++) {
					if (a2 <= 1) {
						System.out.print(" " + num3);
						num3 = num1 + num2;

					} else if (a2 == 2) {
						System.out.print(" " + num3);
					} else {
						num1 = num2;
						num2 = num3;
						num3 = num1 + num2;
						System.out.print(" " + num3);
					}

				    }
				 break;
			
			case 6:
				
			displayStar();
			break;
			}
			
			System.out.println("Do you want to continue(y/n)");
			
			choice = sc.next();
			
		}
		
	}

	public static int add(int n1, int n2, int n3)

	{
		int sum = (n1 + n2 + n3);
		return sum;
	}

	public static int largestNumber(int n1, int n2, int n3, int n4, int n5) {

		if (n1 > n2 && n1 > n3 && n1 > n4 && n4 > n5)
			return n1;
		if (n2 > n3 && n2 > n4 && n2 > n5)
			return n2;
		if (n3 > n4 && n3 > n5)
			return n3;
		if (n4 > n5)
			return n4;
		return n5;

	}
	public static void displayStar(){
	System.out.println("Print star for given value in a Pyramid shape,enter the number");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	String s=("*");
	for (int i=0;i<=n;i++){
		for (int j=0;j<=i;j++){
			System.out.print(s);
			
		}
		System.out.println(s);
		
	}
	}
}
