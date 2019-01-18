package specialTopics.LambdaExpressions;

// lambda expression with multiple parameters

interface NumericTest3 {      // Functional Interface
	boolean test(int n, int d);
}

public class LambdaDemo3 {
	public static void main(String[] args) {
			
		// lambda expression to determine if one number is a factor of another
		NumericTest3 isFactor = (n, d) -> n%d==0;    
		
		int a = 455;
		int b = 15;
		if(isFactor.test(a,b)) System.out.println(b + " is a factor of " + a);
		else System.out.println(b + " is NOT a factor of " + a);
		
		b = 5;
		if(isFactor.test(a,b)) System.out.println(b + " is a factor of " + a);
		else System.out.println(b + " is NOT a factor of " + a);
	}
}
