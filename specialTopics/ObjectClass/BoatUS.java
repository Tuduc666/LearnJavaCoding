package specialTopics.ObjectClass;

public class BoatUS extends Boat {

	public BoatUS(String name, double price) {
		super(name, price);
	}

	@Override
	public double inclTax(double price) {
		return price + price * .04;      // assuming 4 pct tax for consumers in the US
	}

}
