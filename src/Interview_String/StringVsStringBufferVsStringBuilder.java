package Interview_String;

public class StringVsStringBufferVsStringBuilder {
public static void main(String[] args) {
	
	//String -immutable
	String s="welcome";
	
	s.concat("to java");
	System.out.println(s);   //immutable , can not change original value of s
	
	
	//StringBuffer -mutable
	
	/*StringBuffer s=new StringBuffer("welcome");
	s.append("to java");
	
	System.out.println(s);    //mutable, we can change original value of s
	*/
	
	//StringBuilder  -mutable
	
	/*StringBuilder s=new StringBuilder("welcome");
	
	s.append("to java");
	
	System.out.println(s);  //mutable, we can change original value of s
	*/
}
}
