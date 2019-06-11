package testspace;

public class HartfordCourse  extends JavaCourse {
	
	public HartfordCourse() {
	super.req();
	return;
	}
	
	
	public static void main(String[] args) {
		
		JavaCourse newCourse =  new HartfordCourse();
		
		
		System.out.println(newCourse.req());

	
	}
		
}
