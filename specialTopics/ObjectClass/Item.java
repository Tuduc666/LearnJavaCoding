package specialTopics.ObjectClass;

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

public class Item {
	private String name;
	private int price;
	
	// constructor - use for creating new object of type Item
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// constructor - overloading a method
	public Item() {
		this.name = "undefined item";
		this.price = -1;
	}
	
	// constructor - overloading a method
	public Item(Item i) {
		this.name = i.name;
		this.price = i.price;		
//		i.name = "??? item";
//		i.price = -9;	
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// discounted price method
	public void Discount() {
		System.out.println("Discounted " + name + " " + price/2);
	}

	// every class in Java is a subclass of Object class
	// Some of the methods in the Object class are clone(), equals(), and toString()
	// Override the toString() which is called by println()
	// right-click, source, and select option to build toString(), modify as desired
	@Override
	public String toString() {
		return "Item ==> " + name + " " + price;
	}
	
	 
}
