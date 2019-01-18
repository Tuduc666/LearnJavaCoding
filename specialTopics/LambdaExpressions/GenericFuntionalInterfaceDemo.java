package specialTopics.LambdaExpressions;

// Generic Functional Interface with Lambda Expression

interface SomeFunc<T> {      
	T func(T t);
}

public class GenericFuntionalInterfaceDemo {
	public static void main(String[] args) {
			
		// String-based version of SomeFunc
		SomeFunc<String> reverse = (n) -> {
			String result = "";
			
			for(int i=n.length()-1; i>=0; i--)
				result += n.charAt(i);  // can concat a string with a string, a number, or a char
			
			return result;      // return statement is a must
		};    
		
		System.out.println("lambda in reverse is " + reverse.func("lambda"));
		System.out.println("expression in reverse is " + reverse.func("expression"));
		
		// Integer-based version of SomeFunc
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			
			for(int i=1; i<=n; i++)
				result *= i;

			
			return result;      // return statement is a must
		};    
		
		System.out.println("3 factorial is " + factorial.func(3));
		System.out.println("5 factorial is " + factorial.func(5));
	}
}
