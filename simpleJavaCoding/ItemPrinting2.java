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

public class ItemPrinting2 {

	public static void main(String[] args) {
		Item item1 = new Item("Book", 50);
		Item item2 = new Item("Book", 50);
		System.out.println("Item ==> " + item1.getName() + " " + item1.getPrice());
		System.out.println("Item ==> " + item2.getName() + " " + item2.getPrice());
		System.out.println("===========================");
		
		System.out.println(item1);
		System.out.println(item2);
		
		if(item1==item2) System.out.println("item1==item2");
		else System.out.println("not ==");
		
		if(item1.equals(item2)) System.out.println("item1 equals item2");
		else System.out.println("not equals");
		
		String a = "My string";
		String b = "My string";
		
		if(a==b) System.out.println("a==b");
		else System.out.println("string not ==");
		
		if(a.equals(b)) System.out.println("a equals b");
		else System.out.println("string not equals");
		
	}

}
