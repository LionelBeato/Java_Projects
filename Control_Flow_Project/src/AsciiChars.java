
public class AsciiChars {
	public static void printNumbers()
	 {
	 // TODO: print valid numeric input
		//ASCII values 48-57
		for ( int i= 48; i <= 57; i++) {
			char ch = (char)i;
			System.out.print(ch);
		}
		System.out.print("\n");

	 }
	 public static void printLowerCase()
	 {
	 // TODO: print valid lowercase alphabetic input
		 //ASCII values 97-122
		 for ( int i= 97; i <= 122; i++) {
				char ch = (char)i;
				System.out.print(ch);
			}
			System.out.print("\n");

	 }
	 public static void printUpperCase()
	 {
	 // TODO: print valid uppercase alphabetic input
		 //ASCII values 65-90
		 for ( int i= 65; i <= 90; i++) {
				char ch = (char)i;
				System.out.print(ch);
			}
			System.out.print("\n");
	 }

}
