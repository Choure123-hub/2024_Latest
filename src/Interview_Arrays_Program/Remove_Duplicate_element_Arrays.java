package Interview_Arrays_Program;

public class Remove_Duplicate_element_Arrays {
public static void main(String[] args) {
	/*int []a= {3,4,4,5,5,5,6,7,9,9};
	int j=0;
	for(int i=0;i<a.length-1;i++)     //1<10
	{
		if(a[i]!=a[i+1])
		{
			a[j]=a[i];
			j++;   //1
		}
	}
	a[j]=a[a.length-1];
	for(int k=0;k<=j;k++)
	{
		System.out.print(a[k]+" ");
	}
}*/
	
	        int[] a = {3, 4, 4, 5, 5, 5, 6, 7, 9, 9};
	        int j = 0;

	        // Loop through the array, compare each element with the next, and keep only unique elements.
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] != a[j]) {
	                a[++j] = a[i];
	            }
	        }

	        // Print the array with unique elements.
	        for (int k = 0; k <= j; k++) {
	            System.out.print(a[k] + " ");
	        }
	    }
	}


