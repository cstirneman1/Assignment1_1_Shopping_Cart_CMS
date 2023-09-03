
//Interface for a shopping cart

public interface ShoppingCartInterface<T> {
	
	/**
	 * method to add item to cart
	 * @param item adds item to cart
	 */
	boolean addItem(T item);
	
	/**
	 * method to remove item from cart
	 * @param item Item that is removed 
	 */
	boolean removeItem(T item);
	
	/**
	 * method that checks if cart is empty
	 * @return true if cart is empty, false if it is not
	 */
	boolean isEmpty();
	
	/**
	 * method to clear all items from the cart
	 */
	void clearCart();
	
	/**
	 * method to calculate total price of all items in cart
	 * @return the total price
	 */
	double calculateTotalPrice();
	
	/**
	 * method gets number of items in the cart
	 * @return number of items in cart
	 */
	int getCurrentSize();
	
	/**
	 *method that gets the number of duplicate items in the cart
	 * @param item: number of duplicates for the item
	 * @return
	 */
	int getFrequency(T item);
	
	/**
	 * Method that checks if an item is in the cart
	 * @param item: the item that is being checked
	 * @return true if item is in the cart, false if it is not
	 */
	boolean contains(T item);
	
	/**
	 * Method that gets the price for a specific item
	 * @param item: the item that is having the price checked
	 * @return price of the item
	 */
	double getItemPrice(T item);
	
	/**
	 * returns an array of the items in the cart
	 * @return array of items
	 */
	T[] toArray();
	
	/**
	 * method to add a discount to price of an item
	 * @param percentage: the percentage discount
	 */
	void applyDiscount(double percentage);
}

