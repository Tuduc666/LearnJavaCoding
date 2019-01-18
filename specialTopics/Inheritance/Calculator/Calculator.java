package specialTopics.Inheritance.Calculator;

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

public class Calculator {
	final static String ADD = "+";
	final static String SUB = "-";
	
	public static void Display(int x, int y, String operator, int z) {
		System.out.println(x + " " + operator + " " + y + " = " + z);
	}

	public void add(int x, int y) {
		Display(x, y, ADD, x+y);
	}
	
	public void sub(int x, int y) {
		Display(x, y, SUB, x-y);
	}
}
