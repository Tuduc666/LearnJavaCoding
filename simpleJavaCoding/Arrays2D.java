package simpleJavaCoding;

public class Arrays2D {

	/*===============================================================================================
	 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
	 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
	 *  We will be adding new lessons to that website weekly. 
	 *  
	 * -----------        https://www.aspropertiesnyc.com/                 -----------
	 *  For a list of selected real estate properties in New York City for sale and rental...
	 *  please visit our AS Properties NYC website.  New properties are updated daily.
	 *  
	 * -----------     ***   Special Note   ***                            -----------
     *  So we can keep these great videos coming, please help support us by clicking SUBSCRIBE, 
     *  to subscribe to our YouTube channel.  Thank you so much for your support. 
	 *===============================================================================================*/

	// Multiplication table using a 2D array
	public static void main(String[] args) {
		Integer[][]	a = new Integer[9][9];
		
		// load 2D array
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=(i+1)*(j+1);
		// print array
		Print2Darray(a);
	}
	
	public static void Print2Darray(Integer[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%-3d", a[i][j]);
			System.out.println();
		}
			
	}
}
