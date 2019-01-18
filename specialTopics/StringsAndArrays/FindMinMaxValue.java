package specialTopics.StringsAndArrays;

import java.util.Scanner;

public class FindMinMaxValue {

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
		Scanner sc = new Scanner(System.in);
		Integer len;
		
		System.out.println("How many entries would you like to compare?");
		len = sc.nextInt();
		Integer[] a = new Integer[len];
		
		System.out.println("Enter your entries below...");
		for(int i=0; i<len; i++) {
			System.out.println("Entry " + (i+1) + " = ");
			a[i] = sc.nextInt();
		}
		
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;
		for(int i=0;i<len; i++) {
			if(a[i] > max) max = a[i];
			if(a[i] < min) min = a[i];
		}
		
		System.out.println("Max value is " + max);
		System.out.println("Min value is " + min);
		
		sc.close();

	}

}
