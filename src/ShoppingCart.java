
/**
 * This class represents a shopping cart that can hold items.
 * @author cstirneman
 */
public class ShoppingCart    {
	
    private ResizableArrayBag<Item> bag; // Instance variable to hold the shopping cart items
    
    /**
     * Constructs a new shopping cart with an empty collection of items.
     */
    public ShoppingCart() {
    	bag = new ResizableArrayBag<Item>(); // Instantiate ArrayBag
    }
    
    /**
     * Adds an item to the shopping cart.
     * @param item: The item to be added to the cart.
     * @return true if the item was successfully added, false otherwise.
     */
	public boolean addItem(Item item) {
		return bag.add(item);
	}
	
	/**
     * Removes an item from the shopping cart.
     * @param item The item to be removed from the cart.
     * @return true if the item was successfully removed, false otherwise.
     */
	public boolean removeItem(Item item) {
		return bag.remove(item);
	}

	/**
     * Checks if the shopping cart is empty.
     * @return true if the cart is empty, false otherwise.
     */
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	/**
     * Clears all items from the shopping cart.
     */
	public void clearCart() {
		bag.clear();
	}
	
	/**
     * Calculates the total price of all items in the shopping cart.
     * @return The total price of items in the cart.
     */
	public double calculateTotalPrice() {
		double totalPrice = 0.0;
	    Item[] items = toArray();
	  
	    for (Item item : items) {
	        totalPrice += item.getPrice();
	    }
	    
	    return totalPrice;
        
	}
	
	 /**
     * Gets the current number of items in the shopping cart.
     * @return The number of items in the cart.
     */
	public int getCurrentSize() {
		return bag.getCurrentSize();
	}
	
	/**
     * Gets the frequency (number of occurrences) of a specific item in the shopping cart.
     * @param item: The item to check the frequency of.
     * @return The number of times the item appears in the cart.
     */
	public int getFrequency(Item item) {
		return bag.getFrequencyOf(item);
	}

	/**
     * Checks if the shopping cart contains a specific item.
     * @param item: The item to check for in the cart.
     * @return true if the cart contains the item, false otherwise.
     */
	public boolean contains(Item item) {
		return bag.contains(item);
	}

	/**
     * Gets the price of a specific item in the shopping cart.
     * @param item The item to get the price of.
     * @return The price of the item.
     */
	public double getItemPrice(Item item) {
		return item.getPrice();
	}
	
	/**
     * Converts the items in the shopping cart to an array of items.
     * @return An array containing all the items in the cart.
     */
	public Item[] toArray() {
		Object[] itemArray = bag.toArray();
	    Item[] result = new Item[itemArray.length];
	    
	    for (int i = 0; i < itemArray.length; i++) {
	        result[i] = (Item) itemArray[i]; // Cast each element to Item
	    }
	    
	    return result;
	}
}
