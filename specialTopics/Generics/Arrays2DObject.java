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

class Array2DObj {    // Object class 2D array class
	Object[][] arr;
	
	Array2DObj(Object[][] a) {     // constructor
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

class Arrays2DObject {

	public static void main(String[] args) {

		Array2DObj a = new Array2DObj(new Integer[9][9]);

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
		Array2DObj s = new Array2DObj(b);
		
		System.out.println();
		s.Out();      // print array
		
		// RUNTIME ERROR!!!!  Error on the next line is not caught by the compiler
		// RUNTIME ERROR!!!!  If we had used generic type, the compiler would have caught it
		a = s;
		System.out.println();
		System.out.println(a);
	}
}
