package specialTopics.Inheritance.Calculator;

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

public class CalculatorMainRunner {   

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;  
		String op;
		
		System.out.println("Enter 1st integer");
		a = sc.nextInt();
		System.out.println("Enter 2nd integer");
		b = sc.nextInt(); sc.nextLine();
		System.out.println("Enter an operator...  + - * /");
		op = sc.nextLine();
		
//		Calculator c = new Calculator(); 
		AdvancedCalculator ac = new AdvancedCalculator(); 
		
		if(op.equals("+")) ac.add(a, b);
		if(op.equals("-")) ac.sub(a,b);
		if(op.equals("*")) ac.mult(a,b);
		if(op.equals("/")) ac.div(a,b);
		
		sc.close();
	}

}
