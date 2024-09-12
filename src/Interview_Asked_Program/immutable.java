package Interview_Asked_Program;

public class immutable {
public static void main(String[] args) {
	String str1 = "Hello";
    String str2 = str1;
    str1 = "World";
    System.out.println("str1: " + str1 + ", str2: " + str2);

}
}
