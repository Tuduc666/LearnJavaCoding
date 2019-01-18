package simpleJavaCoding;

import specialTopics.ObjectClass.Item;
import specialTopics.ObjectClass.SaleItem;

class Test {
public static void main(String[] args) {
		
		SaleItem item1 = new SaleItem("Car", 20000, 15000, "January 1, 2020");
		System.out.println("Item1 ==> ");
		System.out.println(item1.getName());
		System.out.println("Price = " + item1.getPrice());
		System.out.println("Sale Price = " + item1.getSalePrice());
		System.out.println("Sale Expires on " + item1.getExpirationDate());
		System.out.println("Your discount is " + item1.DiscountPct() + " %");
		System.out.println("================================");
		
		// replicating item1
		Item item2 = item1;
		System.out.println("Item2 ==> ");
		System.out.println(item2.getName());
		System.out.println("Price = " + item2.getPrice());
//		System.out.println("Sale Price = " + item2.getSalePrice());
//		System.out.println("Sale Expires on " + item2.getExpirationDate());
//		System.out.println("Your discount is " + item2.DiscountPct() + " %");   // using method from the SaleItem (the subclass)
		System.out.println("================================");
		

		// modify item2
		item2.setName("Luxury car");
		item2.setPrice(40000);
//		item2.setSalePrice(35000);
//		item2.setExpirationDate("January 1, 2021");
		
		// printing item 1 and item 2
		System.out.println("Item1 ==> ");
		System.out.println(item1.getName());
		System.out.println("Price = " + item1.getPrice());
		System.out.println("Sale Price = " + item1.getSalePrice());
		System.out.println("Sale Expires on " + item1.getExpirationDate());
		System.out.println("Your discount is " + item1.DiscountPct() + " %");
		System.out.println("================================");

		System.out.println("Item2 ==> ");
		System.out.println(item2.getName());
		System.out.println("Price = " + item2.getPrice());
//		System.out.println("Sale Price = " + item2.getSalePrice());
//		System.out.println("Sale Expires on " + item2.getExpirationDate());
//		System.out.println("Your discount is " + item2.DiscountPct() + " %");
		System.out.println("================================");
		
		// using method from the Item (the superclass)
		// the child (the subclass) automatically inherits all variables and methods from the parent
		// the child would be able to access the variables from the parent directly without using the getters and setters
		// if they were defined as public or protected
		item1.Discount();   
		item2.Discount();   
	}
}

class test2 {
	
}
