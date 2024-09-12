package Interview_String;

public class Swpe_String_WithoutUsing_Third_variable {
	public static void main(String[] args) {

		 String s1 = "bhagvanta";
	     String s2 = "choure";

	     System.out.println("Before swapping:");
	     System.out.println("s1 = " + s1);
	     System.out.println("s2 = " + s2);

	     // Swapping without a third variable
	     s1 = s1 + s2; // Concatenate s1 and s2
	     s2 = s1.substring(0, s1.length() - s2.length()); // Extract original s1
	     s1 = s1.substring(s2.length()); // Extract original s2

	     System.out.println("After swapping:");
	     System.out.println("s1 = " + s1);
	     System.out.println("s2 = "+s2);
	     /*swapping works:
	    1) Concatenate s1 and s2: s1 = s1 + s2;
	    After this step, s1 contains "bhagvantachoure".
	    2)Extract original s1: s2 = s1.substring(0, s1.length() - s2.length());s1.length() - s2.length() gives the length of the original s1.s2 is now assigned the substring from the start to this length, which is "bhagvanta".
	    3)Extract original s2: s1 = s1.substring(s2.length());s2.length() gives the length of the original s1.s1 is now assigned the substring from this length to the end, which is "choure".
	*/
	}
}
