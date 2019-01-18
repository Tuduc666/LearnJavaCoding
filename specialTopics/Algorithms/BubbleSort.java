package specialTopics.Algorithms;

import java.util.Arrays;

/*
 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
 *  We will be adding new lessons to that website weekly. 
 *  
 * -----------        https://www.aspropertiesnyc.com/                 -----------
 *  For a list of selected real estate properties in New York City for sale and rental...
 *  please visit our AS Properties NYC website.  New properties are updated daily.
 */

public class BubbleSort {
	// Bubble Sort is a simple sorting algorithm.
	// Bubble Sort works by repeatedly compare and swap each pair of adjacent items if they are in the wrong order.
	
	public static void main(String[] args) {
		int e = ScanIntegerMethod.Scan("Please enter number of array elements to sort.");
		Integer[] a = new Integer[e];
		Arrays.fill(a, 0);
		
		System.out.println("Please enter a positive integer value for each of the array elements...");
		for(int i=0;i<e; i++)
			while(a[i] < 1)
				a[i] = ScanIntegerMethod.Scan("a[" + i +"] = ");
		
		PrintArray(a);
		System.out.println("==========================");
		
		int t;
		// bubble sort
		for(int i=0; i<e-1; i++) {
			for(int j=0; j<e-(i+1); j++) {
				if(a[j] > a[j+1]) {
					t = a[j];
					a[j] = a[j+1];
					a[j+1]=t;
				}
				PrintArray(a);
			}
			System.out.println("I Loop -------------");
		}
	}
	
	public static void PrintArray(Integer[] a) {
			System.out.print("Array = ");
			for(int i=0; i<a.length; i++) 
				System.out.printf("%-5d",a[i]);
			System.out.println();
		
	}
		
}
