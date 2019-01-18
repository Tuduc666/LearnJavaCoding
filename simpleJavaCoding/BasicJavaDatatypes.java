package simpleJavaCoding;

public class BasicJavaDatatypes {

	// ----    https://www.aspropertiesnyc.com/   ---------
	// please visit the above website if you want to buy, sell, or rent homes in NYC
	
	public static void main(String[] args) {
		int myInt = 0;
		double myDouble = 200.50;
		boolean isTrue = false;
		char a;
		String b;
		int c;
		
		Integer myInt2 = 22;
		Double myDouble2 = 222.50;
		
		String myVar = "My variable";
		
		myInt = 25;
		myDouble *= 2;     // 200.5 * 2 = 401
		
		myInt -= 5;      // 25 - 5 = 20
		
		a = myVar.charAt(3);
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
