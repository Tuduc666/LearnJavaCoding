package simpleJavaCoding;

public class Debug {
	
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
	
		// example using 3 individual integer variables
		int a0, a1, a2;
		int a3, a4, a5;
		int a6, a7, a8, a9;
		
		// assign a value to each individual variable
		a0 = 0;
		a1 = 1;
		a2 = 2;
		a3 = 3;
		a4 = 4; 
		a4 -= 1;
		a5 = 5;
		a6 = 6;
		a7 = 7;
		a8 = 8;
		a9 = 9;
		
		// printout the value of each variable
		System.out.println("Example using individual variables...");
		System.out.println(a0);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		
		// ==================================================================
		// example arrays in Java
		int numElement = 100;
		Integer[] a = new Integer[numElement];
		
		// assign a value to each individual variable
		for(int i=0;i<a.length;i++) {
			if(i==4) {
				continue;
			}
			a[i] = i;          
		}
		
		// printout the value of each variable
		System.out.println("Example using arrays...");
		
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);

		
	}
}
