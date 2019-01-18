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

class Array2DR<T extends Number> {    // generic 2D array class
	T[][] arr;
	
	Array2DR(T[][] a) {     // constructor
		arr = a;
	}
	
	void Out() {   // print array method
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.printf("%-5s", arr[i][j]+"");
			System.out.println();
		}
	}
	
	double Sum() {   // sum of all elements in the array
		double sum = 0;
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr[i].length; j++)
				sum += arr[i][j].doubleValue();

		return sum;
	}
}

class Arrays2DBoundedTypes {

	public static void main(String[] args) {

		Array2DR<Integer> a = new Array2DR<>(new Integer[9][9]);

		// load 2D array with multiplication table
		for (int i = 0; i < a.arr.length; i++)
			for (int j = 0; j < a.arr[i].length; j++)
				a.arr[i][j] = (i + 1) * (j + 1);
		
		a.Out();   // print array
		System.out.println("Sum = " + a.Sum());

		
		// load 2D array
		Double[][] b = { 
				{ 1D, 2D}, 
				{ 3D, 4D} } ; 

		Array2DR<Double> s = new Array2DR<>(b);
		
		System.out.println();
		s.Out();      // print array
		System.out.println("Sum = " + s.Sum());
	}
}
