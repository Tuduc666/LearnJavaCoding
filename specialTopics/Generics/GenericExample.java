package specialTopics.Generics;

// T will be replaced by a real type when an object of type Gen is created
class Gen<T> {
	T ob;
	
	Gen(T o){          // constructor
		this.ob = o;
	}
	
	T getob() {        // method to return the object
		return ob;
	}
	
	void showType() {      // show type of T
		// getClass() return the class object of ob.  getName() returns the object class name 
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

class genDemo{
	public static void main(String[] args) {
	
	// Integers
		Gen<Integer> iOb;   // create a Gen reference for Integers
		
		iOb = new Gen<>(88);   // instantiate the Gen Integer object
		
		iOb.showType();        // show iOb datatype
		
		int v = iOb.getob();    // use method in iOb to retrieve the value
		System.out.println(v);
		System.out.println();
		
		
	// Strings
		Gen<String> sOb = new Gen<>("Testing generic object class"); 
		sOb.showType();        // show datatype
		
		String s = sOb.getob();    // retrieve the value
		System.out.println(s);
	}
}
