
public class car {
	int numberOfWheel = 4;
	String brand = null;
	int switches = 0;
	static int[] array = {1, 2, 3, 4, 5, 6};
	
	
	//getter
	public String getBrand() {
		return brand;
	}
	//setter
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch statements
		String color = "orange";
		switch (color) {
			case "orange":
				System.out.println("man, this car is ugly");
				break;
				
			case "blue":
				System.out.println("this is a nice car!");
				break;
			
			default:
				System.out.println("this is not a car at all!");
			}
		
		for(int item: array) {
			if (item < 6) {
			System.out.println(item);
		}

	}
	

}
}
