package simpleJavaCoding;

import java.util.Scanner;

public class forLoopStatement {
	
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
		
		System.out.println("How many times would you like to print the word Hello.");
		Integer j = sc.nextInt();
		
		for(int i=0; i<j ; i++) {             // FOR loop
			System.out.println("Hello");
		}
		
		sc.close();
	}
}
