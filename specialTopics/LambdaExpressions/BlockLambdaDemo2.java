package specialTopics.LambdaExpressions;

// block lambda expression 

interface StringFunc {      
	String func(String n);
}

public class BlockLambdaDemo2 {
	public static void main(String[] args) {
			
		// block lambda expression reverses the characters in a string
		StringFunc reverse = (n) -> {
			String result = "";
			
			for(int i=n.length()-1; i>=0; i--)
				result += n.charAt(i);  // can concat a string with a string, a number, or a char
			
			return result;      // return statement is a must
		};    
		
		System.out.println("lambda in reverse is " + reverse.func("lambda"));
		System.out.println("expression in reverse is " + reverse.func("expression"));
	}
}
