package specialTopics.LambdaExpressions;

// passing lambda expression as argument 

interface StringFunc2 {      
	String func(String n);
}

public class LambdaAsArgument {
	 // method with 2 arguments (a functional interface and a string), returns a string
	static String stringOp(StringFunc2 sf, String s) {
		return sf.func(s);
	}
	public static void main(String[] args) {
		String inStr = "This is a string.";
		String outStr;
		
		System.out.println("Input: " + inStr);
		
		// Here, a simple lambda expression that uppercases a string is passed to stringOp()
		outStr = stringOp((n) -> n.toUpperCase(), inStr);
		System.out.println("Output: " + outStr);
			
		// this passes a block lambda that removes spaces
		outStr = stringOp((n) -> {
			String result = "";
			
			for(int i=0; i<n.length(); i++)
				if(n.charAt(i)!=' ')
					result += n.charAt(i);
			return result;	
		}, inStr);
		System.out.println("2nd Output: " + outStr);
		
		// It is also possible to define StringFunc2 separately and pass it to the method stringOp
		StringFunc2 reverse = (n) -> {
			String result = "";
			
			for(int i=n.length()-1; i>=0; i--)
				result += n.charAt(i);
			return result;		
		};
		// passing reverse (of type StringFunc2) to stringOp
		outStr = stringOp(reverse, inStr);
		System.out.println("3rd Output: " + outStr);
	}
}
