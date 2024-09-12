package Interview_Asked_Number;

public class FibonaccieSeries {
public static void main(String[] args) {
	int n1=0, n2=1,sum=0;
	System.out.print(n1+ " "+n2);
	
	for(int i=2;i<10;i++)
	{
		sum=n1+n2;
		System.out.print(" "+sum);
		n1=n2 ;  //1
		n2=sum ;//1
		
	}
}
}
//2 3 4
//1 3