import java.util.*;

public class project {
	
	
	
	//generic error function
	static void err() {
		System.out.print("Error!");
		return;
	}
	//generic scanner function
	public static String scn(String scn) {
	    Scanner scanner = new Scanner(System.in);
		try {scn = scanner.next();
		
		}
		catch (Exception e) {
			System.out.print("Error! Retry your input: ");
			scn = scanner.next();
			
		}
		
		return scn;
		
	}
	
	
	//generic continue prompt
		static String conn() {
			System.out.print("Do you wish to continue? (Enter 'yes' or 'no'): ");
			String con = scn(null);
			//error checking inside function
			boolean errorPass = false;
			while (errorPass == false) {
			if (!con.equalsIgnoreCase("yes") && !con.equalsIgnoreCase("y") && !con.equalsIgnoreCase("no") && !con.equalsIgnoreCase("n")) {
				System.out.print("MAJOR ERROR! Do you wish to continue? (Enter 'yes' or 'no'): ");
				 con = scn(null);
			}
			else {
				errorPass = true;
			}
			}
			return con;

			
		}
	
	//generic query function
	static  void query(String query) {
		System.out.print(query);
		
	}
	
	//generic entry function for inputed values
	 public static int values (int entry) {

		//scanner input
		    Scanner scanner = new Scanner(System.in);
		    boolean pass = false;
		    
		    
		    if (pass == false) {
		  do {
				 try {
				 entry = scanner.nextInt();
				 
				 if (entry > 999) {
					 System.out.print("That number seems pretty big... are you sure it's correct? (answer 'yes' or 'no'): ");
					 String answer = scanner.next();
					 if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
						 pass = true;
					 }
					 else {
						 try{ System.out.print(" Re-enter your number: ");	
						 scanner.nextInt();
						 }
						 catch (InputMismatchException e) {
							 System.out.print("Error! Try Again: ");
							 
								 scanner.nextInt();
								
							 
						 }
				 	}
				 }
				 pass = true;				
				 
				 } catch (InputMismatchException e) {
					 System.out.print("Error! Wrong input type! Try Again: ");
					 scanner.nextInt();
					 continue;
					 
				 }
				 
				 catch (Exception e) {
					 System.out.print("Error! Try Again: ");
					 scanner.nextInt();
					 continue;
					 
				 }
				 
				 
				 
			    	 
			     } while (pass == false);
	 }
		   return entry;
		
		  
	  }
	 
	//augmented values function for given age
	 public static int valuesAge (int entry) {
		//scanner input
		    Scanner scanner = new Scanner(System.in);
		    boolean pass = false;
		    
		    
		    if (pass == false) {
		  do {
				 try {
				 entry = scanner.nextInt();
				 
				 if (entry < 15) {
				 pass = true;				
				 }
				 else if (entry > 15) {
					 System.out.print("Are you sure your pet is that old? (Enter 'yes' or 'no'): ");
					 String answer = scanner.next();
					 	if (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y")) {
					 		pass = true;
					 	}
					 	else {
							 try{ System.out.print("Roger that! Kindly input your pet's age (this will be the last time I ask): ");	
							 entry = scanner.nextInt();
							 break;
							 }
							 catch (InputMismatchException e) {
								 System.out.print("Error! Try Again: ");
								 entry = scanner.nextInt();
								break;
								 
							 }
					 	}
			
				 }
				 
				 } catch (InputMismatchException e) {
					 System.out.print("Error! Wrong input type! Try Again: ");
					 scanner.nextInt();
					 
				 }
				 
				 catch (Exception e) {
					 System.out.print("Error! Try Again: ");
					 scanner.nextInt();
					 
				 }
				 
				 
			    	 
			     } while (pass == false);
	 }
		   return entry;
		
		  
	  }

	//augmented value function for two digit number
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
						 try {
							 scanner.nextInt();
						 } catch (Exception e) {
							 System.out.println("FATAL SYSTEM ERROR! TERMINATING PROGRAM!");
						 	err();
							 
						 }
						 
					 }
					 
					 else {
						 System.out.print("Error! Try Again: ");
						 try {
							 scanner.nextInt();
						 } catch (Exception e) {
							 System.out.println("FATAL SYSTEM ERROR! TERMINATING PROGRAM!");
						 	err();
							 
						 }
					 }
					 
					 
					 } catch (InputMismatchException e) {
						 System.out.print("Error! Wrong input type! Try Again: ");
						 try {
							 scanner.nextInt();
						 } catch (Exception t) {
							 System.out.println("FATAL SYSTEM ERROR! TERMINATING PROGRAM!");
						 	err();
							 
						 }
						 
					 }
					 catch (Exception e) {
						 System.out.print("Error! Try Again: ");
						 try {
							 scanner.nextInt();
						 } catch (Exception t) {
							 System.out.println("FATAL SYSTEM ERROR! TERMINATING PROGRAM!");
						 	err();
							 
						 }
						 
					 }
					 
					 
				    	 
				     } while (pass == false);
		 }
			   return entry;
			
			  
		  }
	 
	//augmented value function for a given range 
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
						 scanner.nextInt();
					 }
					 
					 } catch (InputMismatchException e) {
						 System.out.print("Error! Wrong input type! Try Again: ");
						 scanner.nextInt();
						 
					 }
					 
					 catch (Exception e) {
						 System.out.print("Error! Try Again: ");
						 scanner.nextInt();
						 
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
		System.out.println("Hello, world!");

		
		//scanner input
	    Scanner scanner = new Scanner(System.in);
	    
	    //name input
	    System.out.print("Enter your name: ");
	    String username = scanner.next();
	    System.out.println("Hello, "+username);
	    
	    //asking the user if they wish to continue
	    
	    String con = conn();
	    
	    
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
		    int petAge = valuesAge(0);
		    
		    
			
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
