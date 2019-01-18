package specialTopics.ObjectClass;

public class CarCAN extends Car {

	public CarCAN(String name, double price) {
		super(name, price);
	}

	// method for calculating the price including tax
	public double inclTax(double price){
		return price + price * .03;      // assuming 3 pct tax for consumers in the CAN
	}
}
