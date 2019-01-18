package simpleJavaCoding;

import java.util.Arrays;

public class Arrays2DMore {

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

	public static void main(String[] args) {
		Integer[][] a = new Integer[9][2];
		// load the 2D array
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)
				a[i][j]=(i+1)*(j+1);
//		 Arrays2D.Print2Darray(a);	
		
		
		Integer[][] aa = {{1,2,3},                    // another way to initialize a 2D array
						  {4,5,6},
						  {7,8,9}}; 
//		aa[1][1]=0;
//		Arrays2D.Print2Darray(aa);	
		
		
		String[][] b = new String[3][];
		b[0] = new String[3];
		b[0][0]="a";
		b[0][1]="b";
		b[0][2]="c";
		b[1] = new String[2];
		b[1][0]="d";
		b[1][1]="e";
		b[2] = new String[4];
		b[2][0]="f";
		b[2][1]="g";
		b[2][2]="h";
		b[2][3]="i";	
		
//		PrintString2Darray(b);	
		Print2Darray(b);	
		
		
		// fill a 2D array, does not work for 2D arrays because  it's copying the pointer reference          
		Arrays.fill(aa, new Integer[] {0,0,0});    
		aa[0][0]=5;
		aa[2][1]=3;
//		Arrays2D.Print2Darray(aa);	
		
		
		// another way to fill the 2D array
		Integer[][] bb = {{0,0,0},{0,0,0},{0,0,0}};
		bb[0][0]=5;
//		Arrays2D.Print2Darray(bb);	
		
		
		
		// fill with nested for loops 
		Integer[][] cc = new Integer[10][10];
		for(int i=0;i<cc.length;i++)
			for(int j=0;j<cc[i].length;j++)
				cc[i][j]=0;
		cc[0][0]=5;
//		Arrays2D.Print2Darray(cc);	
		
		
		
		// fill with for each loop instead
		// i and dd[i] are pointers pointing to the same array
		// so changing on array will also change the other one as well
		Integer[][] dd = new Integer[10][10];
		for(Integer[] i:dd) Arrays.fill(i, 0);   

		dd[0][0]=5;
		dd[9][9]=9;
//		Arrays2D.Print2Darray(dd);	
	
	}
	
	public static void Print2Darray(Integer[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.printf("%-3d", a[i][j]);
			System.out.println();
		}		
	}
	
	// print the String 2D array
	public static void Print2Darray(String[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.printf("%-3s", a[i][j]);
			System.out.println();
		}
	}
}
