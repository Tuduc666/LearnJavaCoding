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

public class AdvancedCalculator extends Calculator {
	final static String MULT = "*";
	final static String DIV = "/";
	
	public void mult(int x, int y) {
		Display(x,y, MULT, x*y);
	}
	
	public void div(int x, int y) {
		Display(x,y, DIV, x/y);
	}

}
