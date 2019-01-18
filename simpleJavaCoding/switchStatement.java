package simpleJavaCoding;

import java.util.Scanner;

public class switchStatement {
	
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
		String s;    
		
		System.out.println("Please enter an integer number between 1 and 7 to represent the day of the week. ctrl-z to exit.");
		
		while(sc.hasNextLine()) {
			System.out.print("The day of the week you have entered is ");
			s = sc.nextLine();     
			
//			if(s.equals("1")) System.out.println("Sunday.");
//			else if(s.equals("2")) System.out.println("Monday.");
//			else if(s.equals("3")) System.out.println("Tuesday.");
//			else if(s.equals("4")) System.out.println("Wednesday.");
//			else if(s.equals("5")) System.out.println("Thursday.");
//			else if(s.equals("6")) System.out.println("Friday.");
//			else if(s.equals("7")) System.out.println("Saturday.");
//			else System.out.println("invalid.");
		
			switch (s) {
			case "1":
				System.out.println("Sunday.");
				break;
			case "2":
				System.out.println("Monday.");
				break;
			case "3":
				System.out.println("Tuesday.");
				break;
			case "4":
				System.out.println("Wednesday.");
				break;
			case "5":
				System.out.println("Thursday.");
				break;
			case "6":
				System.out.println("Friday.");
				break;
			case "7":
				System.out.println("Saturday.");
				break;
			default:
				System.out.println("invalid.");
				break;
			}
			
			System.out.println("Please enter an integer number between 1 and 7 to represent the day of the week. ctrl-z to exit.");
		}

		System.out.println("Goodbye.");
		sc.close();

	}

}
