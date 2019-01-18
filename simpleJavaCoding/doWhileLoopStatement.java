package simpleJavaCoding;

import java.util.Scanner;

public class doWhileLoopStatement {
	
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
		Double input;
		Double sum = 0D;
		
		System.out.println("Please enter a bunch of numbers, each separated by a blank.");
		System.out.println("Enter 'end' at the end of your data.");
		
		do {
			if(sc.hasNextDouble()) {
				input = sc.nextDouble();
				sum += input;
			}
		} while(sc.hasNextDouble());

		System.out.println("The sum of all the numbers = " + sum);
		sc.close();
	}

}
