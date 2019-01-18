package specialTopics.Algorithms;

import java.util.Scanner;

/*
 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
 *  We will be adding new lessons to that website weekly. 
 *  
 * -----------        https://www.aspropertiesnyc.com/                 -----------
 *  For a list of selected real estate properties in New York City for sale and rental...
 *  please visit our AS Properties NYC website.  New properties are updated daily.
 */

public class ScanIntegerMethod {

	public static void main(String[] args) {
		// Create and use java method
		// Euclidean Algorithm - gives you the greatest common divisor (GCD) of two numbers
		//                     - You can also use it to reduce any fraction to its simplest form
		// a = greater number, b = smaller number, r = remainder of a/b . If r = 0, then GCD = b.
		// else a=b, b=r, repeat the process.
		
		Integer oa=0;  // original input - use for displaying the fraction
		Integer ob=0;  // original input - use for displaying the fraction
		Integer a,b,r,t;
		
		System.out.println("This program will calculate the greatest common divisor (GCD) of two numbers entered.  \r\n"
				+ "The system will also give you the simplest fractional form.  \r\n");
		
		while(oa<1)
			oa = Scan("Enter an integer greater zero.");
		while(ob<1)
			ob = Scan("Enter another integer greater zero.");
		
		// place smaller number in the numerator
		if(oa>ob) {
			t=oa;
			oa=ob;
			ob=t;
		}
		a = ob;
		b = oa;
		
		// implement the Euclidean Algorithm
		do {
			r = a % b;
			if(r != 0) {
				a=b;
				b=r;
			}
			
		}while (r != 0);
		
		System.out.println("GCD is " + b);
		System.out.println("Simplest fractional form is " + oa/b + "/" + ob/b);
		

	}
	
	public static Integer Scan(String s) {
		Scanner sc = new Scanner(System.in);
		Integer i=0;
		
		System.out.println(s);
		if(sc.hasNextInt())
			i = sc.nextInt();
		
		return i;
	}
	
	

}
