package lab053119;
import java.util.*;

public class lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hello world to test program
		System.out.println("Hello World!");
	
		//simple int array
		int[] numArray = {1, 3, 4, 6, 0, 11};
		
		//simple for loop to iterate through array
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i]+" ");
		}
		System.out.println();

		
		//enhanced for loop
		
		for (int num:numArray) {
			System.out.print(num+" ");
		}
		System.out.println();

		
		//arraylist word entry program
		
		ArrayList<String> wordArray = new ArrayList<>();
		
		Scanner scanner = new Scanner (System.in);
		
		
		boolean running = true;

		
		while(running == true) {
			
			System.out.print("Enter a simple word(enter QUIT to terminate the program): ");
			String scn = scanner.next();
			
			
			
			if (scn.equalsIgnoreCase("QUIT")){
				running = false;
			} 
			else {
				//add word to list and prompt for another word
				wordArray.add(scn);
			}
					
		}
		
		//let user search in above program
		System.out.print("Check to see if your word is in the array: ");

		String scn = scanner.next();
		if (wordArray.contains(scn)){
			System.out.println("Your word is in the array!");
		}
		else {
			System.out.println("Your word is not in the array!");
		}
		System.out.println();

		
		//playing with queues and stacks
		Queue<String> queue = new ArrayDeque<>(); 
		Stack<String> stack = new Stack<>();
		
		queue.add("Queues");
		queue.add("are");
		queue.add("First In ");
		queue.add("First Out");

		for ( String s: queue)
		{
		  System.out.println(s);
		}

		String rem = queue.remove();

		System.out.println("so removed gives: " + rem);


		stack.push("Stacks");
		stack.push("are");
		stack.push("First In ");
		stack.push("Last Out");

		for ( String s: stack)
		{
		  System.out.println(s);
		}

		rem = stack.pop();

		System.out.println("So pop gives: " + rem);
		System.out.println();

		
		
		//LinkedList testing 
		LinkedList<String> strList = new LinkedList<>();
		  
		strList.add("Hello");
		strList.add("From");
		strList.add("Linked");
		strList.add("Lists");
		strList.add("Do you even");
		strList.add("know you are using");
		strList.add("a list?");

		for(String s: strList)
		{
		  System.out.println(s);
		}

		System.out.println("First list entry is: " + strList.getFirst());
		System.out.println("Last list entry is: " + strList.getLast());

		System.out.println("Size is: " + strList.size());
		System.out.println();

		
		
		//vector test
		Vector<String> vecStr = new Vector<>();
	    
		vecStr.add("Hello");
		vecStr.add("From");
		vecStr.add("Linked");
		vecStr.add("Lists");
		vecStr.add("Do you even");
		vecStr.add("know you are using");
		vecStr.add("a vector?");


		for(String s: vecStr)
		{
		  System.out.println(s);
		}
		int size = vecStr.size();
		int cap = vecStr.capacity();

		System.out.println("Size is: " + size);
		System.out.println("Capacity is: " + cap);
		
		vecStr.add("more");
		vecStr.add("random");
		vecStr.add("Strings");
		vecStr.add("inserted");

		size = vecStr.size();
		cap = vecStr.capacity();

		System.out.println("Size is: " + size);
		System.out.println("Capacity is: " + cap);
		System.out.println();

		
		
		//hashmap testing 
		HashMap<Integer, String> hmIdVal = new HashMap<>();
	    
		hmIdVal.put(1, "Value 1");
		hmIdVal.put(2, "Value 2");
		hmIdVal.put(3, "Value 3");
		hmIdVal.put(4, "Value 4");
		hmIdVal.put(8, "Value 8");

		String val8 = hmIdVal.get(8);
		System.out.println("Value at 8: " + val8);

		String val5 = hmIdVal.get(5);
		System.out.println("Value at 5: " + val5);

		String val6 = hmIdVal.getOrDefault(6, "No Value Found");

		System.out.println("Value at 6: " + val6);


		HashMap<String, String> hmStrStr = new HashMap<>();
		hmStrStr.put("King", "George");
		hmStrStr.put("Prince", "Charming");
		hmStrStr.put("Queen", "Latifah");
		hmStrStr.put("Duke", "Earl");

		for(String str: hmStrStr.keySet())
		{
		  System.out.println("key: " + str + ", value: " + hmStrStr.get(str));
		}
		
		}


	
		
	}


  