package specialTopics.Inheritance.Calculator2;

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

public class OperatorMainRunner {  

	public static void main(String[] args) {
		final String ADD = "+";
		final String SUB = "-";
		final String MULT = "*";
		final String DIV = "/";
		Scanner sc = new Scanner(System.in);
		int a,b;  
		String op;
		Operator add = new AddOperator();
		Operator sub = new SubOperator();
		Operator mult = new MultOperator();
		Operator div = new DivOperator();
		
		System.out.println("Enter 1st integer");
		a = sc.nextInt();
		System.out.println("Enter 2nd integer");
		b = sc.nextInt(); sc.nextLine();
		System.out.println("Enter an operator...  + - * /");
		op = sc.nextLine();
		
		if(op.equals(ADD)) add.op(a,b, ADD);
		if(op.equals(SUB)) sub.op(a,b, SUB);
		if(op.equals(MULT)) mult.op(a,b, MULT);
		if(op.equals(DIV)) div.op(a,b, DIV);
		
		sc.close();
	}

}
