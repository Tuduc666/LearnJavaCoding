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

enum Day {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

class EnumDays {

	public static void main(String[] args) {
		Day today;
		
		today = Day.Monday;
		System.out.println("Today is " + today);

		if (today == Day.Monday) 
			System.out.println("Tomorrow is " + Day.Tuesday);
		else
			System.out.println("Tomorrow is NOT " + Day.Tuesday);
		
		switch (today) {
		case Friday :
		case Saturday :
			System.out.println("Yeah.  We are off tomorrow!");
			break;
		case Sunday :
		case Monday :
		case Tuesday :
		case Wednesday :
		case Thursday :
			System.out.println("Yeah.  We get to go to work tomorrow!");
			break;
		}
		
		System.out.println();
		for (Day d : Day.values())    // values() returns an array
			System.out.println(d);      
	}
}
