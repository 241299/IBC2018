package day_3;

public class Coffee {
	
	// "Public" price for customers
    private int mPricePublic;
	
	// Price for shopkeeper
    private int mPrice;
	
	// Description of the product
    private String mDescription;
	
    protected int getPrice() {
        return mPrice;
    }

    public int getPricePublic() {
        return mPricePublic;
    }

	/**
		Constructor
	*/
	
    Coffee(int price, String description) {
        this.mPrice = price;
        this.mPricePublic = 2 * price;
        this.mDescription = description;
    }
}
