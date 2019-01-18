package simpleJavaCoding;

class Recursion {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 3 is " + f.fact(3));
		System.out.println("Factorial of 4 is " + f.fact(4));
		System.out.println("Factorial of 5 is " + f.fact(5));

	}
}

// e.g. 5 factorial = 5*4*3*2*1 = 120
// Recursion is a method that calls itself.  
// For example, a method to calculate the factorial of a number.
class Factorial{
	int fact (int n) {
		int result;
		
		if(n==1) return 1;
		result = fact(n-1) * n;
		return result;
	}
}
