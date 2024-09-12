package Interview_String;

public class ReplaceJunk {
public static void main(String[] args) {
	String str="@#!&*?%^is world";
	 String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");
	System.out.println(str1);
}
}
