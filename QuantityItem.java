/*****************************************************************************************************************
Amon Johnson
CMSC 3274
11/1/2022
Dr.Hernandez
******************************************************************************************************************/
public class QuantityItem extends AbstractItem
{
	Product prod;
	double q;
	String description;

	public QuantityItem(Product product, double quantity) {
		product = prod;
		quantity = q;
	}

	@Override
	public double getTotalPrice() {
		return Product.getPrice() * q;
	}

	@Override
	public String getDescription(int length) {
		
		return String.format("%-"+(length-13)+"%8.2f%5d",Product.getDescription(),Product.getPrice(), q);
	}



}
