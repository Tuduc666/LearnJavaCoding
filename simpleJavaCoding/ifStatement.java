package simpleJavaCoding;

import java.util.Scanner;

public class ifStatement {
	
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
		
		System.out.println("Is your name Max, yes or no");
		Boolean b;
		
		String rs = sc.nextLine();     
		System.out.println("Your reponse is " + rs);
		
		b = rs.equals("yes");
		System.out.println("b = " + b);
		if(b) {
			System.out.println("You are Max");	
		}
		else {
			System.out.println("You are not Max");
		}
		
		System.out.println("Goodbye.");
		
		sc.close();

	}

}
