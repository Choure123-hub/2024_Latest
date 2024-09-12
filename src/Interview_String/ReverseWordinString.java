package Interview_String;

public class ReverseWordinString {
public static void main(String[] args) {
	String str="welcome to java";   //original String
	
	String[] words = str.split(" "); // splitting String into words
	String Revst="";
	
	for(String w:words)
	{
		String Revwo="";
		for(int i=w.length()-1;i>=0;i--)
		{
			Revwo=Revwo+w.charAt(i);
		}
		Revst=Revst+Revwo+" ";
	}
	System.out.println(Revst);
}
}
