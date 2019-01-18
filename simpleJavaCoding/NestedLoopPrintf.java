package simpleJavaCoding;

public class NestedLoopPrintf {
	
/*
 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
 *  We will be adding new lessons to that website weekly. 
 *  
 * -----------        https://www.aspropertiesnyc.com/                 -----------
 *  For a list of selected real estate properties in New York City for sale and rental...
 *  please visit our AS Properties NYC website.  New properties are updated daily.
 */
	
	/* building a multiplication table with print formatting */
	public static void main(String[] args) {
		for (int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%-3d",i*j);
			}
			System.out.println();
		}
	}
}
