package specialTopics.LambdaExpressions;

interface MyNumber {      // Functional Interface
	double getValue();
}

public class LambdaDemo {
	public static void main(String[] args) {
		MyNumber myNum;     // declare an interface reference
		
		// lambda expression when assigned to myNum, a class instance is constructed in which
		// the lambda expression implements the getValue() method in MyNumber
		myNum = () -> 123.45;    
		
		// call getValue(), which is provided by the previously assigned lambda expression
		System.out.println("Value1: " + myNum.getValue());
		
		// load myNum with a different lambda expression
		myNum = () -> Math.random() * 100;
		System.out.println("Value2: " + myNum.getValue());
		System.out.println("Another Value2: " + myNum.getValue());
		
		// lambda expression must be compatible with the functional interface definition
//		myNum = () -> "Mystring";    //  ERROR!!!! datatype does not match functional interface definition
	}

}
