import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to the wounder cave treasure hunt");
System.out.println("press the touch screen on your right and type press to proceed");
Scanner sc = new Scanner(System.in);
sc.next();
System.out.println("processing Please wait");
System.out.println("Enter your name");
 sc = new Scanner(System.in);
String name = sc.next();
System.out.println(name + " do not enter if your heart is weak");
System.out.println("Do you still want to enter " + name + " \"yes\" or \"no\" ");
sc = new Scanner(System.in);
String choice=sc.next();
if (choice.equalsIgnoreCase("yes")){
System.out.println("Wish you all the best to find out treasure");

System.out.println("Take the first left,knock the door,you will see a pop up container that has 3 box,pick one");
System.out.println("Type the box number in the scree on right");
sc = new Scanner(System.in);
int box = sc.nextInt();

switch (box) {
case 1:
	System.out.println("press the button under the box that will open a door,Enter that dark room and stay with the skeletons for 5 hours");
	break;
case 2:
	System.out.println("press the button under box and it will open up a dark path to a forest");
	break;
case 3:
	System.out.println("press the button under box that will open a path under the ground jump into it");
	break;
	
	}
System.out.println("Are you done with your challenge: \"yes\" or \"no\"");
sc = new Scanner(System.in);
String challengedone=sc.next();
if (challengedone.equalsIgnoreCase("yes")){
	System.out.println("congratulations you are close to the treasure hunt");
	System.out.println("Chose your most favorite treasure choice from music,drama,dance");
	sc = new Scanner(System.in);
	String treasurechoice = sc.next();
	switch (treasurechoice){
	case "music":
	System.out.println("look above a ladder will pop out step up and you will enter the treasure room  of musical instruments: enjoy playing it");
break;
	case "drama":
		System.out.println("a glass room will slide open and you will enter the treasure room to enjoy the strory of alibaba and forty thieves: enjoy the play ");
	break;
	case "dance":
		System.out.println("look under for a pop up path way follow that and you will enter the treasure room  of realtime dance players: enjoy the dance");
	break;

	}
		
}else {
	System.out.println("Better Luck next time follow the exit path");
}


}
else
System.out.println("check in next time, Bye Bye");
sc.close();
}
	
	}



	
