package Interview_Asked_Program;

import java.util.Arrays;

public class RemoveDuplicateValue_From_arrays {
	public static void main(String[] args) {
		
	//int[] a= {20,20,14,12,13,8,8};
		
int[]a= {3,4,4,5,5,5,6,7,9,9};
int j=0;
for(int i=0;i<a.length-1;i++)
{
if(a[i]!=a[i+1])
{
	a[j]=a[i];
	j++;
}
}
	a[j]=a[a.length-1]	;
	
	for(int k=0;k<=j;k++)
	{
		
		System.out.print(a[k]+" ");
	}
}
}