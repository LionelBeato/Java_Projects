package testspace;

import java.util.*;

public class linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> classList = new LinkedList<>();
		classList.add("Nadia");
		classList.add("Scott");
		classList.add("Dani");
		classList.add("Mamadou");
		classList.add("Ricardo");
		classList.add("Tony");
		classList.add("Greg");
		classList.add("Lionel");

System.out.println(classList);


	//queue at apple store turn them into a stack and push and pop

	Queue<String> q = new LinkedList<String>();
	q.add("Mike");
	q.add("Jon");
	q.add("Nicole");
	q.add("Jacob");
	
	System.out.println(q.enqueue());
	
	Stack<String> s = (Stack)q;
	System.out.println(s);
	
	


		

	}

}
