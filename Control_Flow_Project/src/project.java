import java.util.*;

public class project {
	
	static  void query(String query) {
		System.out.print(query);
		
	}
	
	 public static int values (int entry) {
		//scanner input
		    Scanner scanner = new Scanner(System.in);
		    boolean pass = false;
		    
		    
		    if (pass == false) {
		  do {
				 try {
				 entry = scanner.nextInt();
				 pass = true;				
				 
				 } catch (InputMismatchException e) {
					 System.out.print("Error! Wrong input type! Try Again: ");
					 scanner.next();
					 
				 }
				 
				 catch (Exception e) {
					 System.out.print("Error! Try Again: ");
					 scanner.next();
					 
				 }
				 
				 
			    	 
			     } while (pass == false);
	 }
		   return entry;
		
		  
	  }
	 
	 public static int valuesTwoDigit (int entry) {

			//scanner input
			    Scanner scanner = new Scanner(System.in);
			    boolean pass = false;
			    
			    
			    if (pass == false) {
			  do {
					 try {
					 entry = scanner.nextInt();
					 if (entry < 100) {
					 pass = true;		
					 }
					 
					 else if (entry >= 100) {
						 System.out.print("Error! Your number is too big! Try Again: ");
						 scanner.next();
						 continue;
					 }
					 
					 else {
						 System.out.print("Error! Try Again: ");
						 scanner.next();
					 }
					 
					 
					 } catch (InputMismatchException e) {
						 System.out.print("Error! Wrong input type! Try Again: ");
						 scanner.next();
						 
					 }
					 catch (Exception e) {
						 System.out.print("Error! Try Again: ");
						 scanner.next();
						 
					 }
					 
					 
				    	 
				     } while (pass == false);
		 }
			   return entry;
			
			  
		  }
	 
	 public static int valuesRanged (int entry, int x, int y) {
			//scanner input
			    Scanner scanner = new Scanner(System.in);
			    boolean pass = false;
			    
			    
			    if (pass == false) {
			  do {
					 try {
					 entry = scanner.nextInt();
					 if (entry > x && entry < y ) {
					 pass = true;		
					 }
					 else {
						 System.out.print("Error! Try Again: ");
						 scanner.next();
					 }
					 
					 } catch (InputMismatchException e) {
						 System.out.print("Error! Wrong input type! Try Again: ");
						 scanner.next();
						 
					 }
					 
					 catch (Exception e) {
						 System.out.print("Error! Try Again: ");
						 scanner.next();
						 
					 }
				    	 
				     } while (pass == false);
		 }
			   return entry;
			
			  
		  }


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//prints out "Hello, world!"
		System.out.println("Hello, world!");
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();		
		
		//scanner input
	    Scanner scanner = new Scanner(System.in);
	    
	    //name input
	    System.out.print("Enter your name: ");
	    String username = scanner.next();
	    System.out.println("Hello, "+username);
	    
	    //asking the user if they wish to continue
	    
	    
	    System.out.print("Do you wish to continue?(Enter yes or no): ");
	    String con = scanner.next();
	    
	    //while loop that restarts when told to:
	    boolean running = true;
	    while (running == true) {
	    	while (con.equalsIgnoreCase("yes")||con.equalsIgnoreCase("y")){
	    
	    	//continuing with the program...
	    	//favorite pet
	    	query("Enter the name of your favorite pet: ");
		    String petName = scanner.next();
		    
		    //favorite pet's age
		    
		    query("How old is "+petName+"?: ");
		    int petAge = values(0);
		    
		    
			
		     //lucky number 
		    query("Enter your lucky number: ");
		    int luckNum = values(0);

		    //jersey number input
		    query("Enter the jersey number of your favorite Quarterback. If you don't have one, make one up!: ");
		    int jerseyNum = values(0);
		    
		    //car model year input
		   query("Enter the two-digit model year of your car. If you don't have one, pick a random year!: ");
		    int yearNum = valuesTwoDigit(0);
		    
		    //name of favorite actor
		    query("Enter the first name of your favorite actor: ");
		    String actName = scanner.next();

		    //random number between 1-50
		    query("Enter a random number between 1 and 50: ");
		    int randNum = valuesRanged(0, 1, 50);
		    
		    //code to generate lucky numbers
		    
		    //establishing magic numbers as an array
		    
		    int[] magicArray = {jerseyNum, luckNum};
		    int random =(int) Math.round(Math.random()*1);
		    		    
		    //declare lottery numbers
		    //pet age plus car model year
		    int lotOne = petAge + yearNum;
		    //first letter of favorite actor converted to int
		    int firstCh = actName.charAt(0);
		    int lotTwo = (int)firstCh;
		    //model year plus lucky number
		    int lotThree = yearNum;
		    //the number 42
		    int lotFour = 42;
		    //quarterback number plus lucky number plus age of pet
		    int lotFive = jerseyNum+luckNum+petAge;
		    
	  
		   //lottery numbers!
		    System.out.print(lotOne+", "+lotTwo+", "+lotThree+", "+lotFour+", "+lotFive);
		   
		    

		    int magicBall = magicArray[random];
		    
		    System.out.println(" Magic Ball: "+magicBall);
		    
		    running = false;
		    
	
		    
		    
		    if (running == false){
				    System.out.print("Would you like to play again? (Enter yes or no):");
				    String answer = scanner.next();
				    	if (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y")) {
				    		running = true;
				    		continue;
				    		
				    	}
				    	else if (answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("n")) {
				    		System.out.println("Thank you for your time!");
				    		return;
				    	}


			    }
	    }
		  
	    
		   
	    
	    while (con.equalsIgnoreCase("no")||con.equalsIgnoreCase("n")){
		    System.out.println("Come back again for the survey at a later date.");
		    return;
	    }
	    
	    	
	    
	   

	
	

}
}


}
