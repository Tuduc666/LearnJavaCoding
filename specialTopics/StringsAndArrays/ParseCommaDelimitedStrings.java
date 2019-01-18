package specialTopics.StringsAndArrays;

import java.util.Scanner;

public class ParseCommaDelimitedStrings {

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
		String input;
		String[] s = new String[50];     // max 50 words
		
		System.out.println("Please enter a comma separated string, 50 words max.");
		input = sc.nextLine();
		
		s = input.split(",");
		
		for(String a : s) System.out.println(a);
		
		System.out.println(s[1]);
		
		sc.close();

	}

}
