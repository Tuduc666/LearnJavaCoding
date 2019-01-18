package simpleJavaCoding;

/*
 * Find the number with an odd number of occurrences in the array.  
 * There will only be one number with an odd number of occurrences.
 */

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

  
/* 
 The ^ operator in Java
^ in Java is the exclusive-or ("xor") operator.

Let's take 5^6 as example:

(decimal)    (binary)
     5     =  101
     6     =  110
------------------ xor
     3     =  011

This the truth table for bitwise (JLS 15.22.1) and logical (JLS 15.22.2) xor:

^ | 0 1      ^ | F T
--+-----     --+-----
0 | 0 1      F | F T
1 | 1 0      T | T F

More simply, true if you have "this and that".  false otherwise.
this = 0
that = 1

Note: a number xor itself will always equal to zero.  Also any number xor itself will always equal to itself.
     5     =  101
     5     =  101
------------------ xor
     0     =  000
 */

class FindOddOccurences {
	public static void main(String[] args) {
		int[] a = { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 };
	    int num = 0;
	    for (int i = 0; i < a.length; i++)  
	    	num ^= a[i];    
	    // equals to xor = xor ^ A[i]
	    // the reason this works is because a number xor itself is equal to zero
	    // so the sum of all numbers would be equal to the single odd number
	       
		System.out.println(num + " appears odd number of times in the array.");

	}

}
