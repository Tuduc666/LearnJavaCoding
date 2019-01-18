package specialTopics.ObjectClass;

public class CarUS extends Car {

	public CarUS(String name, double price) {
		super(name, price);
	}

	// method for calculating the price including tax
	public double inclTax(double price){
		return price + price * .04;      // assuming 4 pct tax for consumers in the US
	}
}
