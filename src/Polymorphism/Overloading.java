package Polymorphism;

public class Overloading {
public void addition(int a,int b) {
	System.out.println(a+b);
	
	
}
public void addition(int a,int b,int c) {
	System.out.println(a+b+c);
	
	
}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.addition(10, 20, 5);
	o.addition(0, 50);
}
}
