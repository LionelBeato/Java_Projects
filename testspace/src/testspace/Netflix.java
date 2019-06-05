package testspace;

public class Netflix implements IMovi {
	
	@Override
	public String title() {
		// TODO Auto-generated method stub
		return "Batman";
	}
	
	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String director() {
		// TODO Auto-generated method stub
		return "Tim Burton";
	}


	@Override
	public int yearOfRelease() {
		// TODO Auto-generated method stub
		return 1989;
	}


	@Override
	public int rating() {
		// TODO Auto-generated method stub
		return 100;
	}


	





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Netflix show = new Netflix();
		System.out.println(show.title());
		System.out.println(show.director());
		System.out.println(show.yearOfRelease());
		System.out.println(show.rating());

		

	}

	
	
}


	