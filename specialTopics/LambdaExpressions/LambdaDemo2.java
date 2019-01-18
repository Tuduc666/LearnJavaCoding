package specialTopics.LambdaExpressions;

// lambda expression that takes a parameter

interface NumericTest {      // Functional Interface
	boolean test(int n);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
			
		// lambda expression to test if a number is even
		// type of n is not declared, it is inferred from context, which is defined as int in the functional interface
		NumericTest isEven = (n) -> n%2==0;    
		
		if(isEven.test(10)) System.out.println("10 is even.");
		if(isEven.test(9)) System.out.println("9 is even.");
		else System.out.println("9 is odd.");
		
		// lambda expression to test if a number is negative
		NumericTest isNeg = n -> n<0;    
		
		if(isNeg.test(-10)) System.out.println("-10 is negative.");
		if(isNeg.test(9)) System.out.println("9 is negative.");
		else System.out.println("9 is positive.");
	}
}
