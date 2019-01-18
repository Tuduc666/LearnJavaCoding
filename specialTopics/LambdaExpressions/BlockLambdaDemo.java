package specialTopics.LambdaExpressions;

// block lambda expression 

interface NumericFunction {      // Functional Interface
	int func(int n);
}

public class BlockLambdaDemo {
	public static void main(String[] args) {
			
		// block lambda expression to compute the factorial of an integer value
		NumericFunction factorial = (n) -> {
			int result = 1;
			
			for(int i=1; i<=n; i++)
				result *= i;
			
			return result;      // return statement is a must
		};    
		
		System.out.println("3 factorial is " + factorial.func(3));
		System.out.println("5 factorial is " + factorial.func(5));
	}
}
