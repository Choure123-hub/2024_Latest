package Interview_Arrays_Program;

import java.util.Arrays;

public class FindSecondSmall_largestsecond {
	public static void main(String[] args) {
		int[] a = { 4, 2, 3, 1,0, 6,12,15,20 };
		int num=a.length;
		Arrays.sort(a);
		System.out.println("Second Largest element is "+a[num-2]); //Display Second
		
		System.out.println("Second Smallest element is "+a[4]);
	}
	}

