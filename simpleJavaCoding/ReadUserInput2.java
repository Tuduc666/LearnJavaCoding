package simpleJavaCoding;

import java.util.Scanner;

public class ReadUserInput2 {
	
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

		System.out.println("Please enter 2 integers...");
		int i = sc.nextInt();    
		int j = sc.nextInt();    
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i * j = " + i*j);
		
		sc.close();

	}

}
