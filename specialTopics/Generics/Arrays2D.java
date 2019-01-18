package specialTopics.Generics;

//	/*===============================================================================================
//	 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
//	 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
//	 *  We will be adding new lessons to that website weekly. 
//	 *  
//	 * -----------        https://www.aspropertiesnyc.com/                 -----------
//	 *  For a list of selected real estate properties in New York City for sale and rental...
//	 *  please visit our AS Properties NYC website.  New properties are updated daily.
//	 *  
//	 * -----------     ***   Special Note   ***                            -----------
//     *  So we can keep these great videos coming, please help support us by clicking SUBSCRIBE, 
//     *  to subscribe to our YouTube channel.  Thank you so much for your support. 
//	 *===============================================================================================*/

class Array2D<T> {    // generic 2D array class
	T[][] arr;
	
	Array2D(T[][] a) {     // constructor
		arr = a;
	}
	
	void Out() {   // print array method
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.printf("%-3s", arr[i][j]+"");
			System.out.println();
		}
	}
}

class Arrays2D {

	public static void main(String[] args) {

		Array2D<Integer> a = new Array2D<>(new Integer[9][9]);

		// load 2D array with multiplication table
		for (int i = 0; i < a.arr.length; i++)
			for (int j = 0; j < a.arr[i].length; j++)
				a.arr[i][j] = (i + 1) * (j + 1);
		
		a.Out();   // print array

		
		// load 2D array
		String[][] b = { 
				{ "a", "b", "c" }, 
				{ "d", "e", "f" }, 
				{ "g", "h", "i" } };
		Array2D<String> s = new Array2D<>(b);
		
		System.out.println();
		s.Out();      // print array
		
		// No runtime error!!!  
		// the error in the next line is caught by the compiler
//		a = s;
//		System.out.println();
//		System.out.println(a);
	}
}
