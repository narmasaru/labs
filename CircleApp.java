import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = "y";
				
		
		System.out.println("Welcome to the circle Tester");
		
while(choice.equalsIgnoreCase("y")){
		try {
			
			
			System.out.println("Enter radius");
			double radius = sc.nextDouble();
			Circle circle1 = new Circle(radius);
			circle1.getArea();
			circle1.getCircumference();
			System.out.println("Circumference is :" + circle1.getFormattedCircumference());
			System.out.println("Area is :" + circle1.getFormattedArea());
            System.out.println("you created " +Circle.getObjectCount());
			} catch (InputMismatchException ex) {
			System.out.println("Invalid entry: enter a number");
			sc.next();
            continue;
		}

		System.out.println("Would you like to create another circle?(y/n)");
         choice = sc.next();
        

}
      sc.close();    
	}


	

}
