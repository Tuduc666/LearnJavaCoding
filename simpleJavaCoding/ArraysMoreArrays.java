package simpleJavaCoding;

import java.util.Arrays;

public class ArraysMoreArrays {
	
/*
 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
 *  We will be adding new lessons to that website weekly. 
 *  
 * -----------        https://www.aspropertiesnyc.com/                 -----------
 *  For a list of selected real estate properties in New York City for sale and rental...
 *  please visit our AS Properties NYC website.  New properties are updated daily.
 */

	public static void main(String[] args) {
	// a.length, a.clone(), Arrays.copyOf, Arrays.fill, Arrays.equals
		
		Integer[] a = new Integer[10];
		Integer[] b = new Integer[5];
		
		for(int i=0;i<a.length;i++) a[i] = i;    // fill array with 0,1,2,3,....
		
		Arrays.fill(b, 3);                       // fill array all 3s
		
		// =====================================================================================
		b = a.clone();
		a[0] = -1;
		
		if(Arrays.equals(a, b)) System.out.println("The arrays are equal");
		else System.out.println("The arrays are NOT equal");
		
		// =====================================================================================
		
		System.out.println("Array A...");
		for(int i : a) System.out.println(i);
		
		System.out.println();
		
		System.out.println("Array B...");
		for(int i=0;i<b.length;i++) System.out.println(b[i]); 
	}
}
