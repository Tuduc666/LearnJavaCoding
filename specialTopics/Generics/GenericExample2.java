package specialTopics.Generics;

// T, V will be replaced by a real type when an object of type TwoGen is created
class TwoGen<T, V> {
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2){          // constructor
		ob1 = o1;
		ob2 = o2;
	}
	
	T getob1() {        // method to return the object
		return ob1;
	}
	
	V getob2() {        // method to return the object
		return ob2;
	}
	
	void showType() {      // show type of T
		// getClass() return the class object of ob.  getName() returns the object class name 
		System.out.println("Type of T is " + ob1.getClass().getName());
		System.out.println("Type of V is " + ob2.getClass().getName());
	}
}

class twoGenDemo{
	public static void main(String[] args) {
	
	// Integers, Strings
		TwoGen<Integer, String> iOb;   // create a TwoGen reference for Integers
		
		iOb = new TwoGen<>(88, "Testing generics");   // instantiate the TwoGen Integer object
		
		iOb.showType();        // show iOb datatype
		
		int v = iOb.getob1();    // use method in iOb to retrieve the value
		System.out.println(v);
		String s = iOb.getob2();    // use method in iOb to retrieve the value
		System.out.println(s);
		System.out.println();
		
		
	// Strings, Double
		TwoGen<String, Double> sOb = new TwoGen<>("Testing generic object class", 66D); 
		sOb.showType();        // show datatype
		
		String str = sOb.getob1();    // retrieve the value
		System.out.println(str);
		Double d = sOb.getob2();    // retrieve the value
		System.out.println(d);
	}
}
