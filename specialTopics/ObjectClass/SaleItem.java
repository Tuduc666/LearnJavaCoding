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

public class SaleItem extends Item {
	private int salePrice;
	private String expirationDate;
	
	// constructor - new SaleItem
	public SaleItem(String name, int price, int salePrice, String expirationDate) {
		super(name, price);
		this.salePrice = salePrice;
		this.expirationDate = expirationDate;
	}
	
	// constructor - replicate SaleItem
	public SaleItem(SaleItem i) {
//		super(i.getName(), i.getPrice());       // parent = child (ok).  child = parent (not ok)
		super(i);    // this statement does the same job as the above statement. A child is a parent + extra.  parent = child (ok)
		this.salePrice = i.salePrice;
		this.expirationDate = i.expirationDate;
	}

	// getters and setters
	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public double DiscountPct() {
		return 100 - (double) salePrice*100/(double) getPrice();
	}
	
}
