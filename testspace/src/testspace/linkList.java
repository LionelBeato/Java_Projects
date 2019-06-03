package testspace;

import java.util.*;

public class linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap of State keys and capital values
		
        HashMap<String, String> capitals = new HashMap<>(); 
        
        capitals.put("CT","Hartford");
        capitals.put("AL","Montgomery");
        capitals.put("OR","Salem");

        //print out capital 
        
        System.out.println("the capital of CT is: "+capitals.get("CT"));

		
		//LinkedLists of Capitals and another of States with the same index 
		
		LinkedList<String> capitalList = new LinkedList<>();
		capitalList.add("Hartford");
		capitalList.add("Montgomery");
		capitalList.add("Salem");
		
		
		LinkedList<String> stateList = new LinkedList<>();
		stateList.add("CT");
		stateList.add("AL");
		stateList.add("OR");


		//print out capital of the specified state
		
		int x = 0;
		System.out.println("The capital of "+stateList.get(x)+" is: "+capitalList.get(x));
		

	}

}
