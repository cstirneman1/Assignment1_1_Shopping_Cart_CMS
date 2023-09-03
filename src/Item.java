
/**
 * The `Item` class represents an item that can be added to a shopping cart.
 */
public class Item implements ItemInterface {

	private String name;
	private double price;
	private String description;
	
	/**
     * Constructs an `Item` object with the specified name, price, and description.
     * @param name: The name of the item.
     * @param price: The price of the item.
     * @param description: A description of the item.
     */
	public Item(String name, double price, String description) {
		this.name=name;
		this.price = price;
		this.description = description;
	}
	
	/**
     * Gets the name of the item.
     * @return The name of the item.
     */
	public String getName() {
		return name;
	}
	
	/**
     * Sets the name of the item.
     * @param name The new name for the item.
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * Gets the price of the item.
     * @return The price of the item.
     */
	public double getPrice() {
		return price;
	}

	 /**
     * Sets the price of the item.
     * @param price The new price for the item.
     */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
     * Gets a description of the item.
     * @return The description of the item.
     */
	public String getDescription() {
		return description;
	}
	
	/**
     * Sets the description of the item.
     * @param description The new description for the item.
     */
	public void setDescription(String description) {
		this.description = description;
	}

}

