package specialTopics.ObjectClass;

public class BoatCAN extends Boat {

	public BoatCAN(String name, double price) {
		super(name, price);
	}

	@Override
	public double inclTax(double price) {
		return price + price * .03;      
	}

}
