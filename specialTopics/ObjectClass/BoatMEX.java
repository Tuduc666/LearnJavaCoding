package specialTopics.ObjectClass;

public class BoatMEX extends Boat {

	public BoatMEX(String name, double price) {
		super(name, price);
	}

	@Override
	public double inclTax(double price) {
		double rtPrice = price + price * .1;   // assuming 10 pct tax for consumers in the MEX
		rtPrice += 99;                         // 99 county tax
		rtPrice += 500;                         // VAT tax
		return rtPrice;     
	}

}
