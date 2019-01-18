package simpleJavaCoding;

public class ArraysForEachLoop {
	
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
	
		String[] a = {"zero", "one", "two", "three"};    // declare and initializatiion
		
		// printout the value of each variable
		System.out.println("Example using arrays...");
		
		for(String value : a)              // FOR EACH LOOP
			System.out.println(value);
		
		System.out.println("the length of the array is " + a.length);

	}
}
