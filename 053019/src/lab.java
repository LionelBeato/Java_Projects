import java.util.*;
import java.math.*;




public class lab {
	
	//fabricated function to find prime, I got the basic gist of this but I think I could understand it better
	//this can also print out the primes but for the purposes of this program, it prints out a boolean

	public static boolean findPrime(int numChecked){
		
		
		if (numChecked <= 1) {
			return false;
		}
		for (int s=2;s<numChecked;s++){
			if (numChecked%s == 0) {
				return false;
			}
			else {
				continue;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		
		//initializes number 
		
		int[] numArray = new int[100];
		
		int arrayElement;
		
		//beefy for loop that computes the things
		for (int i=0;i<100;i++) {
			
			arrayElement = i;	
						
		    numArray[arrayElement] = arrayElement;
		    
		    String num = Integer.toString(numArray[arrayElement]);
		    
		    BigInteger numInt = new BigInteger(num);
		    
		    if (numInt.isProbablePrime(0)==true) {
		    	System.out.print(numInt+" ");
		    	System.out.println(findPrime(numArray[arrayElement]));
		    }
		    
		   // this prints out the non primes
			    else {
			   	System.out.print(numInt+" ");
			 	System.out.println(findPrime(arrayElement));
			    }
	    
		}
		
		for(int inputYear=1900;inputYear<2100;inputYear++){
			if (findPrime(inputYear)==true) {
				if (findPrime(inputYear-4)==true) {
					System.out.println("class of "+inputYear+" is a prime class");
				}
				else {
					continue;
				}
				
			}
			else {
				continue;
			}
		
		}
		
	
	}

}
