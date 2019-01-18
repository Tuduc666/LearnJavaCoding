package specialTopics.Generics;

class NonGen {
	Object ob;
	
	NonGen(Object o){          // constructor
		this.ob = o;
	}
	
	Object getob() {        // method to return the object
		return ob;
	}
	
	void showType() {      // show object datatype
		// getClass() return the class object of ob.  getName() returns the object class name 
		System.out.println("Object datatype is " + ob.getClass().getName());
	}
}

class nonGenDemo{
	public static void main(String[] args) {
	
	// Integers
		NonGen iOb = new NonGen(88);   // instantiate the NonGen Integer object
		iOb.showType();        // show iOb datatype
		
		int v = (int) iOb.getob();    // casting is needed here!!!!!!
		System.out.println(v);
		System.out.println();
		
		
	// Strings
		NonGen sOb = new NonGen("Testing generic object class");   
		sOb.showType();        // show datatype
		
		String s = (String) sOb.getob();    // casting is needed here!!!!!!
		System.out.println(s);
		
	// ====== everything above works exactly the same as generics type, only needed to add the casting ======
		iOb = sOb;    // only problem here is the compiler allow this statement to happen, generic wouldn't allow
		System.out.println(iOb);   // this statement would print sonething weird => specialTopics.Generics.NonGen@7852e922
		v = (int) iOb.getob();    // the compiler cannot catch this...  Runtime Error!!!!!
	}
}
