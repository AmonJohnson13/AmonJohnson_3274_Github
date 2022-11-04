
public class FixedPriceItem extends AbstractItem {
	double price;
	String description;
	
	public FixedPriceItem(String string, double d) {
		description = string;
		price =d;
	}
	@Override
	public double getTotalPrice() {
		
		return price;
	}
	@Override
	public String getDescription(int length) {
		
		return description;
	}

}
