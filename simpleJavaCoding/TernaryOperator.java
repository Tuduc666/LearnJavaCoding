package simpleJavaCoding;

import java.util.Scanner;

/*===============================================================================================
 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
 *  We will be adding new lessons to that website weekly. 
 *  
 * -----------        https://www.aspropertiesnyc.com/                 -----------
 *  For a list of selected real estate properties in New York City for sale and rental...
 *  please visit our AS Properties NYC website.  New properties are updated daily.
 *  
 * -----------     ***   Special Note   ***                            -----------
 *  So we can keep making these great videos, please help support us by clicking SUBSCRIBE, 
 *  to subscribe to our YouTube channel.  Thank you so much for your support. 
 *===============================================================================================*/

public class TernaryOperator {
	public static void main(String args[]) {
		Integer input, abs;
		
		do {
			input = Scan("Please enter a number:");
			if(input != null) {
//				abs = AbsoluteValue(input);
				abs = input<0 ? input*-1 : input;    // expression1 ? expression2 : expression3; 
				System.out.println("Number entered is " + input);
				System.out.println("It's absolute value is " + abs);
			}
		} while(input != null);
	}
	
	public static Integer Scan(String s) {
		Scanner sc = new Scanner(System.in);
		Integer i = null;
		
		System.out.println(s);
		if(sc.hasNextInt()) 
			i = sc.nextInt();
		return i;
	}
	
	// Absolute value - tells you how far the number is from zero.
	// i.e. absolute value of -9 and 9, are both equal to 9.
//	public static Integer AbsoluteValue(Integer i) {
//		if(i<0) i*= -1;
//		return i;
//	}
}
