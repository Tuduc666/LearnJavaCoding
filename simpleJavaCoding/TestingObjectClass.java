package simpleJavaCoding;

import specialTopics.ObjectClass.Item;

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

public class TestingObjectClass {

	public static void main(String[] args) {
		Item item1 = new Item("Car", 20000);
		System.out.println("Item1 ==> " + item1.getName() + " " + item1.getPrice());
		System.out.println("================================");
		Item item2 = new Item("Book", 50);
		System.out.println("Item2 ==> " + item2.getName() + " " + item2.getPrice());
		System.out.println("================================");
		Item item3 = new Item();
		System.out.println("Item3 ==> " + item3.getName() + " " + item3.getPrice());
		System.out.println("================================");
		item3.setName("Sofa"); 
		item3.setPrice(1000);
		System.out.println("Item3 ==> " + item3.getName() + " " + item3.getPrice());
		System.out.println("================================");
		Item item4 = new Item(item2);
		System.out.println("Item4 ==> " + item4.getName() + " " + item4.getPrice());
		System.out.println("================================");
		System.out.println("Item2 ==> " + item2.getName() + " " + item2.getPrice());
		System.out.println("================================");
		item1.Discount();
		item2.Discount();

	}

}
