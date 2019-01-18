package simpleJavaCoding;

// as soon as UseStatic class is loaded, all static statements are run.
// first a is set to 3.  
// Then static block executes (same as firstcycle)
// Then main() is called, which calls meth().
public class UseStatic {
	// static variables are global variables, without referencing a specific instance of the variable
	// only one copy of the static variable exists.
	static int a = 3;
	static int b;
	
	// static method can be called without instantiating the object
	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	// Static block is used for initialization, similar to first cycle.
	// this block gets executed only once when the class is first loaded
	static {   
		System.out.println("Static block is used for initialization, similar to first cycle.");
		b = a*4;
	}

	public static void main(String[] args) {
		meth(42);    // static method can be called without instantiating the object

	}

}
