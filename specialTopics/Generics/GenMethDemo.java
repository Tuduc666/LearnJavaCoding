package specialTopics.Generics;

// demonstrate a simple generic method
public class GenMethDemo {
	
	// determine if an object is in an array
	// Comparable is an interface declared in the java.lang
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for (int i=0; i<y.length; i++)
			if(x.equals(y[i])) return true;
		return false;
	}

	public static void main(String[] args) {
		
		// use isIn() on Integers
		Integer[] nums = {1,2,3,4,5};
		
		if(isIn(2, nums)) System.out.println("2 is in nums");
		if(!isIn(7, nums)) System.out.println("7 is not in nums");
		System.out.println();
		
		
		// use isIn() on Strings
		String[] s = {"one","two","three"};
		
		if(isIn("two", s)) System.out.println("Two is in string");
		if(!isIn("seven", s)) System.out.println("Seven is not in string");
		System.out.println();
		
//		if(isIn("two", nums)) System.out.println("Two is in string");  // won't compile, V must be a subclass of T


		
		
	}
}
