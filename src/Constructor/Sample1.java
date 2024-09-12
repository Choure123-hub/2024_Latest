package Constructor;

public class Sample1 {
	
	
	int num1;
	int num2;
	Sample1()
	{
		num1=10;
		num2=10;
	}
	
	
	public void add() {
		System.out.println(num1+num2);
		
	}
	
	
	
	
	
public static void main(String[] args) {
	Sample1 s= new Sample1();
	s.add();
}
}
