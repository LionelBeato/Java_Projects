package testing;

import java.util.ArrayList;

public class testing {
	
	//new ArrayList to use with vehicle class
	
	public static ArrayList<Object> inventArray = new ArrayList<>(); 
	
	
	//big ArrayList function that returns a single vehicle array with details as elements
    
     public static ArrayList<String> arrayMake(String setType, String setMake, String setModel, String setYear) 
     {
    	 
    	
    	//new instance of vehicle class 
    	Vehicle newVehicle1 = new Vehicle();
    	//actual ArrayList function
    	ArrayList<String> vehicleArray = new ArrayList<>(); 
    	
    	//setters
    	
		newVehicle1.setType(setType);
		newVehicle1.setMake(setMake);
		newVehicle1.setModel(setModel);
		newVehicle1.setYear(setYear);
		
		//getters
    	 
    	String type = newVehicle1.getType();
    	String make = newVehicle1.getMake();
    	String model = newVehicle1.getModel();
    	String year = newVehicle1.getYear();

    	     	 
    	 vehicleArray.add(type);
    	 vehicleArray.add(make);
    	 vehicleArray.add(model);
    	 vehicleArray.add(year);

    	 
   		return vehicleArray;
    	 
     }
     
     //function to add to inventArray
     
     public static ArrayList<Object> allInventory() {
    	 
    	 inventArray.add(arrayMake("help","me", "im", "stuck"));
    	 inventArray.add(arrayMake("wait", "I", "got", "it"));
    	 inventArray.add(arrayMake("oh", "god","its", "midnight"));

    	 return inventArray;
     }

    
     
	  
			  

	  public static void main(String[] args) {
		  
		  Object cars = allInventory();
		  System.out.println(cars);
		  
		 
		  
		  		  	  }


}
