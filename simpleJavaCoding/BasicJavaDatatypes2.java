package simpleJavaCoding;

public class BasicJavaDatatypes2 {

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
		int myInt = 0;
		double myDouble = 200.50;
		Boolean isTrue = false;
		Character a;
		String b;
		int c;
		
		Integer myInt2 = 22;
		Double myDouble2 = 222.50;
		
		String myVar = "My variable";
		
		myInt = 25;
		myDouble *= 2;     // 200.5 * 2 = 401
		
		myInt -= 5;      // 25 - 5 = 20
		
		a = myVar.charAt(1);
		b = myVar.toLowerCase();
		c = myVar.length();
		
		String d = myInt2.toString();
		
		
		System.out.println(myVar + " myInt = " + myInt);
		System.out.println(myVar + " myDouble = " + myDouble);
		System.out.println("My boolean variable = " + !isTrue);

		System.out.println("My variable myInt2 = " + myInt2);
		System.out.println("My variable myDouble2 = " + myDouble2);
		
		System.out.println("My character a = " + a);
		System.out.println("My string b = " + b);
		System.out.println("My int c = " + c);
		System.out.println("My variable d = " + d);
	}

}
