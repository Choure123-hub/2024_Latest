package Interview_Arrays_Program;

import java.util.Arrays;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class practice {
	
	
	public void addition(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		
	}
	public void addition(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
		
	}
	


public static void main(String[] args) {
	
	 practice obj=new  practice();
	 obj.addition(10, 20);
	 obj.addition(1, 10, 40);
	
}}