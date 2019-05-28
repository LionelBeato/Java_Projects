package lab052419;

import java.util.Scanner;

public class lab {
	
	public static void main(String[] args) {
		
		// scanner reads input from the command line through various methods
	    Scanner scanner = new Scanner(System.in);
	  
	    // prompt and read a string
	    System.out.print("Enter your name: ");
	    String username = scanner.next();
	  
	    // prompt and read an int
	    System.out.print("Enter your age: ");
	    int age = scanner.nextInt();
	    
	    //prompt to read employment status
	    System.out.print("Enter you employment status(E for employed, U for unemployed, S for student): ");
	    char employ = scanner.next().charAt(0);
	    
	    //prompt to read ownership of vehicle
	    System.out.print("Enter what kind of vehicle you have (C for car, T for truck, V for van, N for none): ");
	    char vehicle = scanner.next().charAt(0);
	    
	  

	    
	  
	    System.out.println(String.format("Hello %s, your age is %d", username, age));
	    
	    //outputs employment status using switch/cases:
	    switch (employ){
	    		case 'E': System.out.println(String.format("Cool, you are employed"));
		    
		    
	    		case 'U': System.out.println(String.format("Bummer, you don't have a job!"));
		    
	    		case 'S': System.out.println(String.format("Wow, good for you! You're a student!"));
	    }
	    
	    
		//outputs vehicle status:
	    switch(vehicle) {
	    	case 'C': System.out.println(String.format("Hooray! A Car! Vroom vroom!"));
	    	
	    	case 'T': System.out.println(String.format("Whoa! A big truck! I hope its red!"));
	    	
	    	case 'V': System.out.println(String.format("A van person huh? Well at least you're mobile."));
	    	
	    	case 'N': System.out.println(String.format("No car? And how old are you?"));
	    }
	    

		    
		    
		  
		    
		    
	    
	    //- if 16 or older, print "You are old enough to drive"
	    if (age >= 16 && age < 18) {
	    	System.out.println("You are old enough to drive");
	    }
	    //- if 18 or older, print "You are old enough to vote"
	    else if (age >= 18 && age < 21) {
	    	System.out.println("You are old enough to vote");
	    }
	    //- if 21 or older, print "You are old enough to drink"
	    else if (age >= 21 && age < 35) {
	    	System.out.println("You are old enough to drink");
	    }
	    //- if 35 or older, print "You are old enough to be President"
	    else if (age >= 35 && age < 55) {
	    	System.out.println("You are old enough to be President");
	    }
	    //- if 55 or older, print "You can join AARP"
	    else if (age >= 55 && age < 67) {
	    	System.out.println("You are old enough to join AARP");
	    }
	    // - if 67 or older, print "You can starting drawing Social Security"
	    else if (age >= 67) {
	    	System.out.println("You are old enough to start drawing Social Security");
	    }
	    
		   // * declare an integer array with 30 elements
		   // - `int[] myArray = new int[30];` 
	    
	    
			//* with a `for` loop, initialize the array with the same number as the index. [0] = 0, [1] = 1, etc.
			//* print out the contents of each element of the array using an enhanced `for`
		    
		    int[]myArray = new int[30];
		    for (int count = 0; count <= 30; count++) {
		    		
		    		for (int woo:myArray) {
		    			myArray[woo] = count;
		    			System.out.println(myArray[woo]);	
		    			break;
					    }
		    }
		    
		    //* with a `for` loop, reassign the elements of the array with the even numbers up to 60.
		    //* print out the contents of each element of the array using an enhanced `for`
		    //* print the contents of the array in reverse order.
		    
		    int[]myOtherArray = new int[30];
		    for (int count = 0; count <= 30; count++) {
		    		
		    		for (int woo:myOtherArray) {
		    			myOtherArray[woo] = count*2;
		    			System.out.println(myOtherArray[woo]);
		    			break;
					    }		    				    				    		
		    }
		    
		    //wrote a second instance of this and used a modulo operator to only print out evens
		    for (int count = 60; count >= 0; count--) {
		    	for (int woo:myOtherArray) {
		    		myOtherArray[woo] = count;
		    		if (myOtherArray[woo] % 2 == 0) {
			    	System.out.println(myOtherArray[woo]);
			    	break;
		    		}
		    		else {
		    		break;
		    		}
		    	}
		    	
		    	
		    }
		    
		    //write the last two statements from the previous step
		    //forward enhanced for and reverse order, using `while` loops.
		    
		    
		    
		    int woo = 0;
		    int count = 0;
		    do {
		    	count++;
		    	myOtherArray[woo] = count*2;
		    	if (myOtherArray[woo]%2 == 0) {
		    		System.out.println(myOtherArray[woo]);
		    	}
		    }
		    while(count < 30);
		    
		    //reverse part
		    
		    
		   int countAgain = 60;
		     do {
		    	 myOtherArray[woo] = countAgain--; 
		    	 	if (myOtherArray[woo]%2==0) {
		  		System.out.println(myOtherArray[woo]);
		    	}
		    }  
		    while(countAgain > 0);
	
		    
		    			    		   		
	}

}
