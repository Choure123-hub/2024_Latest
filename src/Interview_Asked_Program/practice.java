package Interview_Asked_Program;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	int []a={9,8,12,25,12,18,18,};
	Arrays.sort(a);
	int j=0;
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]!=a[i+1])
		{
			j++;
		}
	}
	a[j]=a[a.length-1];
	for(int k=0;k<=j;k++)
	{
		System.out.print(a[k]+" ");
	}
	}
}

