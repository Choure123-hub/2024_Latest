package Interview_Arrays_Program;

public class Find_MinValue {
public static void main(String[] args) {
	int []a= {4,23,5,0,2,1,16};
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(min>a[i])   //min>a[i]
		{
			min=a[i];
		}
		
	}
	System.out.println(min);
	
}
}
