import java.util.Scanner;

public class Lab2Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome! What is your name? ( enter your name)");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
	  int game = 1;
		
	
		System.out.println("Would you like to play a game? (enter \"yes\" or \"no\")");
		 sc = new Scanner(System.in); 
		 String choice = sc.next();
		
		 

		 if (choice.equalsIgnoreCase("yes")) {
		 	System.out.println("You are walking across a field and you encounter a fire-breathing dragon!");
		 	System.out.println("What would you do? (enter \"face the beast\" or \" Run away\")");
		 	sc = new Scanner(System.in);
		 	String choicetwo = sc.nextLine();
		 	
		 	if  (choicetwo.equalsIgnoreCase("face the beast")){
		 	
		 	System.out.println("You approach the dragon. You see that he has_____ heads. ( enter \"1\" or \"2\" or \"3\")");
		 	 sc = new Scanner(System.in);
		 	int number = sc.nextInt();
		 	
		 	
		 	 
		    switch (number) {
		 	  case 1:
		 	    System.out.println("No one has ever faced a 1-headed dragon before! Choose your weapon (enter \"slingshot\" or \"sword\" or \"bow and arrow\")");
		 	    break;
		 	  case 2:
		 		 System.out.println("No one has ever faced a 2-headed dragon before! Choose your weapon (enter \"slingshot\" or \"sword\"  \"bow and arrow\")");
		 	    break;
		 	  case 3:
		 		 System.out.println("No one has ever faced a 3-headed dragon before! Choose your weapon (enter \"slingshot\" or \"sword\"  \"bow and arrow\")");
		 	    break;
		 	    
		 	    
		 	    
		 	}
		    
		    sc = new Scanner(System.in);
		    String weapon =sc.nextLine();
		    
		    
		    if (weapon.equalsIgnoreCase("slingshot")){
		    	
		    	game = 1;
		    }
		    else if(weapon.equalsIgnoreCase("sword")){
		    	
		    	game = 2;
		    }
               else if (weapon.equalsIgnoreCase("bow and arrow")){
		    	
		    	game = 3;
		    
               }
		    
		    switch(game) {
		 	  case 1:
		 	    System.out.println("Armed with your Sling shot, you approach the dragon. You can feel it is fiery breath as you get closer. It starts at you with its___ eyes. (enter \"red\" or \"blue\")");
		 	    break;
		 	  case 2 :
		 		 System.out.println("Armed with your Sword, you approach the dragon. You can feel it is fiery breath as you get closer. It starts at you with its___ eyes. (enter \"red\" or \"blue\")");
		 	    break;
		 	  case 3:
		 		 System.out.println("Armed with your bow and arrow, you approach the dragon. You can feel it is fiery breath as you get closer. It starts at you with its___ eyes. (enter \"red\" or \"blue\")");
		 	    break;
		 	    
		 	    
		 	    
		 	}
		    sc = new Scanner(System.in);
		    String eye =sc.nextLine();
		    
		    if (eye.equalsIgnoreCase("red")){
		    	System.out.println("Oh thank Goodness! Red eyed dragons are friendly. You pet it and become friends");
		    	System.out.println("You name the dragon_____.(enter name)");
		    	sc = new Scanner(System.in);
			    String dragonname =sc.nextLine();
			    
			   // System.out.println("name and dragonname lives happily ever after");
			    System.out.println(name +" and " + dragonname +" lives happily ever after ");
			    
		    }
		    
		    
		    
		    
		    
		  }
		 	
		 }
		 	else {
			
			  System.out.println("Thank you, Try out something");
		 
		 }
		 sc.close();
	}
}






	
	
			 
		 	
		 	
		 	
		 	
		 	
 

