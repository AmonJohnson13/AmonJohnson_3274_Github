/*****************************************************************************************************************
Amon Johnson
CMSC 3274
11/1/2022
Dr.Hernandez
******************************************************************************************************************/
/**
   Describes a product with a description and a price.
*/
public class Product
{
   private static String description;
   private static double price;

   /**
      Constructs a product from a description and a price.
      @param aDescription the product description
      @param aPrice the product price
   */
   public Product(String aDescription, double aPrice)
   {
      description = aDescription;
      price = aPrice;
   }

   /**
      Gets the product description.
      @return the description
   */
   public static String getDescription()
   {
      return description;
   }

   /**
      Gets the product price.
      @return the unit price
   */
   public static double getPrice()
   {
      return price;
   }
}
