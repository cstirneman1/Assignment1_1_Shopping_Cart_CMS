
/**
 * Interface for Item ADT for Shopping Cart
 * @author Chris Stirneman
 *
 */
public interface ItemInterface<T> {

	/**
	 * method to get the item name
	 * @return item name
	 */
	String getName();
	
	/**
	 * method to set the name of the item
	 * @param name
	 */
	void setName(String name);
	
	/**
	 * method to get the price of an item
	 * @return price of the item
	 */
	double getPrice();
	
	/**
	 * method to set the price of an item
	 * @param price
	 */
	void setPrice(double price);
	
	/**
	 * method to get a string description of the item
	 * @return description of item
	 */
	String getDescription();
	
}

