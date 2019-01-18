package simpleJavaCoding;

public class Arrays2DOverloading {

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
     *  So we can keep making these great videos, please help support us by clicking SUBSCRIBE, 
     *  to subscribe to our YouTube channel.  Thank you so much for your support. 
	 *===============================================================================================*/

	public static void main(String[] args) {	
	// Method Overloading (overloading a method)
		
		Integer[][] a = {{1,2,3},                    
						  {4,5,6},
						  {7,8,9}}; 
		Print2Darray(a);	
		
		
//		String[][] b = {{"a","b","c"},                    
//				        {"d","e","f"},
//				        {"g","h","i"}}; 
//		Print2Darray(b);	

		
	
	}
	
	public static void Print2Darray(Integer[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%-3d", a[i][j]);
			System.out.println();
		}		
	}
	
	public static void Print2Darray(String[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%-3s", a[i][j]);
			System.out.println();
		}		
	}
	
}
