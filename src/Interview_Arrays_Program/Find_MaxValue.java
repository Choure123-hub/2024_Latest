package Interview_Arrays_Program;

public class Find_MaxValue {
public static void main(String[] args) {
	int []a= {4,23,5,2,1,16};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(max<a[i])   //min>a[i] 16<
		{
			max=a[i];
		}
		
	}
	System.out.println(max);
	
}
}
