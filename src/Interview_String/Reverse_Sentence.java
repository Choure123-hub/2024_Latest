package Interview_String;

public class Reverse_Sentence {
public static void main(String[] args) {
	String sent="india is my country";
	String[] rsent=sent.split(" ");
	
	String Rev="";
	for(int i=rsent.length-1;i>=0;i--)
	{
		Rev=Rev+rsent[i]+" ";
	}
	System.out.println(Rev);
}
}
