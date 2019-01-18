package simpleJavaCoding;

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

enum Day2 {
	Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);
	
	private int DayNum;   // numeric day equivalent
	
	Day2(int n){     // constructor
		DayNum = n;
	}
	
	int getDayNum() {   // method to return numeric day
		return DayNum;
	}
}

class EnumDays2 {

	public static void main(String[] args) {
		Day2 today;
		
		today = Day2.Monday;

		System.out.print(today + " is the " + today.getDayNum());
		
		switch (today) {
		case Sunday :
			System.out.println("st day of the week.");
			break;			
		case Monday :
			System.out.println("nd day of the week.");
			break;			
		case Tuesday :
			System.out.println("rd day of the week.");
			break;			
		case Wednesday :
		case Thursday :
		case Friday :
		case Saturday :
			System.out.println("rd day of the week.");
			break;			
		}   
		
		System.out.println("The numeric day number for tomorrow is " + Day2.Tuesday.getDayNum());
		
		System.out.println();
		for(Day2 d : Day2.values())
			System.out.println(d + " is day number " + d.getDayNum());
		
	}
}
