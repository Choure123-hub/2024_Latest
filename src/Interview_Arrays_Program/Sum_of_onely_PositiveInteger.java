package Interview_Arrays_Program;

public class Sum_of_onely_PositiveInteger {

	public static void main (String[] args) 
	{
		
		int [] arr= {12,-4,8,-9};
		int sum=0;
		for(int num:arr)
		{
			if(num>0)
			{
				sum +=num;
			}
		}
		System.out.println("Sum of positive integer: "+sum);
	}
}

