
public class lab {
	
	//random number generator function that accepts inputs
	public static int uggo (int hex) {
		Integer fee = hex;
		 if (fee.compareTo(10) == -1) {
			 System.out.println("error! "+ fee.compareTo(10));
		 }
		 
		 else {
			return (int)(Math.random() * fee);
		 }
		return fee;
		
	}

	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub'
		
		
		//generator for 20 random numbers 
		for (int loo = 1; loo <= 20; loo++) {
			int ree = uggo(1000);		
			System.out.println (ree);
		}
		
		//generator for 20 random numbers with a range 50-100
		for(int doo = 1; doo <=20;) {
			int ree = uggo(1000);	
			if (ree < 100 && ree > 50) {
				System.out.println("50-100 only: "+ree);
				doo++;
				
			}
			else {
				continue;
			}
		}
		
		//for loop that generates a number up to 1000 20 times
		for (int gener = 1; gener >= 30; gener++) {
			
		}
		
		//random number generator
		int randOne = (int)(Math.random() * 100);
		System.out.println(randOne);
		//initial if statements checking number size
		if (randOne > 70) {
			
			System.out.println("Wow! Big Number!");
            Thread.sleep(50);

			
		}
		if (randOne < 40) {
			
			System.out.println("Wow... small number!");
            Thread.sleep(50);

		}
		
		if (randOne > 40 && randOne < 70 || randOne == 40 || randOne == 70) {
			
			System.out.println("Wow... medium number!");
            Thread.sleep(50);

			
		}
		
		
		//revised if statements with else
		if (randOne > 70) {
			
			System.out.println("Wow! Big Number!");
            Thread.sleep(50);

			
		}
		
		else if (randOne < 40) {
			
			System.out.println("Wow... small number!");
            Thread.sleep(50);


		}
		
		else if (randOne > 40 && randOne < 70 || randOne == 40 || randOne == 70){
			
			System.out.println("Wow... medium number!");
            Thread.sleep(50);

	
		}
		
		//nested statements segment
		
		if (randOne > 90) {
			System.out.println("Wow... now this is a BIG number!");
            Thread.sleep(50);


		}
		else if (randOne < 15) {
			System.out.println("Holy Moly... now this is a small number!");
            Thread.sleep(50);

			}
		else if (randOne == 50) {
			System.out.println("Now this number is perfectly average in every way.");
            Thread.sleep(50);


		}
		
		//for loop that prints out 1-30
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
            Thread.sleep(50);
			//print out only even numbers 
			if(i % 2 == 0) {
				System.out.println("Wow! "+i+" is even!");
				System.out.println("\n");
	            Thread.sleep(50);


			}
		}
		
		//loop that counts down from 20
		for (int l = 20; l >= 0; l--) {
			System.out.println(l);
            Thread.sleep(50);


		}
	
		
		//examining output of complex for statement
		for (int x = 1, y = 1; x < 20 && y < 50; x++, y += 4)
		{
		 System.out.println("X is: " + x + ", y is: " + y);
		}
		
		//long string declaration
		
		String stn = "Wow! This is a very, very, very, very, very, long string!";
		
		char c = stn.charAt(0); //return W
		System.out.println(c);
		
		//for loop that prints out every character in the string above on a separate line
		
		for (int f = 0; f < stn.length(); f++) {
			
			char b = stn.charAt(f);
			
			//if statement that capitalizes every vowel
			
			if ( b == 'a' || b == 'e' || b == 'o' || b == 'i' || b == 'u') {
				b = Character.toUpperCase(b);
				System.out.println(b);

			}
			
			else {
				System.out.println(stn.charAt(f));

			}
			
			//switch statements that does the same thing
			
			char g = stn.charAt(f);
			switch (g) {
			case 'a':
				g = Character.toUpperCase(g);
				System.out.println(g);
				break;
			case 'e':
				g = Character.toUpperCase(g);
				System.out.println(g);
				break;
			case 'i':
				g = Character.toUpperCase(g);
				System.out.println(g);
				break;
			case 'o':
				g = Character.toUpperCase(g);
				System.out.println(g);
				break;
			case 'u':
				g = Character.toUpperCase(g);
				System.out.println(g);
				default:
					System.out.println(g);
			}
			
		}
		
		//while loop that stops at 20th iteration or the generated value is over 85
		
		int randTwo = 0;
		int q = 1;

		
		while (randTwo < 85 || q < 20) {
				randTwo = (int)(Math.random() * 100);
				System.out.println(randTwo);
				q++;
		}
		
		
		//for loop that prints out 1-30
		for (int a = 1; a <= 30; a++) {
            Thread.sleep(50);
			//print out only even numbers and adds continue
			if(a % 2 == 0) {
				System.out.println("Wow! "+a+" is even!");
				System.out.println("\n");
				continue;


			}
		}
		
		
		
		//nested for loops
		int inner = 0;
		int outer;
		for ( outer = 1; inner <= 350; outer++) {
			for ( inner = 1; outer <= 30 && inner <= 350; inner+=outer, outer++) {
			System.out.println("outer: "+outer+", inner: "+inner);
			
			}
		}

	
			
		
		//complex do-while loop that breaks after the 30th iteration or if the ouput is over 1000
		
		int u;
		int r = 1;
		
		do {
			r++;
			int h = (int)(Math.random() * 100);
			int j = (int)(Math.random() * 100);
		    u = h * j; 
		    if (u > 1000) {
				System.out.println(u+" is too big!!!");
		    	return;
		    }
		    else {
		    	System.out.println(u);
		    }

		}while (u < 1000 || r < 30);
		
		
		
		
		}
				
	}


