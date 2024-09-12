package Interview_Arrays_Program;

import java.util.Arrays;

public class UniqueValues {
	public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5, 5};
        
        // Sort the array
        Arrays.sort(a);
        
        System.out.println("Unique values in the array:");
        
        // Traverse the sorted array to find unique values
        for (int i = 0; i < a.length; i++) {
            // Check if the current element is unique
            if ((i == 0 || a[i] != a[i - 1]) && (i == a.length - 1 || a[i] != a[i + 1]))
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
