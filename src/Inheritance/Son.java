package Inheritance;

public class Son extends  Father 
{
public void mobile() {
	System.out.println("mobile:noikia");
}
public static void main(String[] args) {
	Son s=new Son();
	s.car();
	s.flat();
	s.farmhouse();
	s.mobile();
}
}
