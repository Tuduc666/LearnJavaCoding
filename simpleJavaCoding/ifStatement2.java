package simpleJavaCoding;

import java.util.Scanner;

public class ifStatement2 {
	
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
		
		System.out.println("How old are you?");
		Integer age = sc.nextInt();
		
		if(age<13) {
			System.out.println("You are a kid.");
			System.out.println("Go have some fun.");
		}
		else if(age<20) System.out.println("You are a teenager.");
		else System.out.println("You are an adult.");

		System.out.println("Your age is " + age);
		
		sc.close();

	}

}
