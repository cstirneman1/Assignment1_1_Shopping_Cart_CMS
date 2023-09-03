
public class Application {
	/**
     * The main method where the application starts.
     * @param args 
     */
	public static void main(String[] args) {
        Item item1 = new Item ("Shirt", 10.99, "Red shirt that costs $10.99");
        Item item2 = new Item ("Shirt", 10.99, "Red shirt that costs $10.99");
        Item item3 = new Item ("Pants", 15.99, "Blue jeans that costs $15.99");
        Item item4 = new Item ("Hat", 20.99, "Hat that costs $15.99");
        Item item5 = new Item ("Shoes", 74.99, "Shoes that costs $15.99");
        
        ShoppingCart shoppingCart = new ShoppingCart();
        
        //Testing the addItem method
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
        shoppingCart.addItem(item4);
        shoppingCart.addItem(item5);
        
        //Testing the isEmpty Method
       System.out.println( "Is the cart empty? " +shoppingCart.isEmpty());
       System.out.println();
       
       //Testing getCuurentSize
       System.out.println("Current size of shopping cart: " + shoppingCart.getCurrentSize());
       System.out.println();

        
       // Testing toArray method
        System.out.println("Items in the cart:");
        Item[] itemsArray =  shoppingCart.toArray();
        
        for (Item item : itemsArray) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println();

        //Testing getItemPrice method
        System.out.println("Item price: "+item5.getName()+" - $"+ shoppingCart.getItemPrice(item5));
        System.out.println();
        
        //Testing CalculateTotalPrice
        System.out.println("Total price of items in the cart: $"+shoppingCart.calculateTotalPrice());
        System.out.println();

        //Testing contains method
        System.out.println("Does the shopping cart contain this item?: "+ shoppingCart.contains(item5));
        System.out.println();

        //Testing getFrequency method
        System.out.println("Frequency of item: "+ shoppingCart.getFrequency(item1));
        System.out.println();

        //Testing the remove method
        shoppingCart.removeItem(item5);
        System.out.println("Removing an Item!");
        System.out.println("Items in the cart:");
        Item[] itemsArray1 =  shoppingCart.toArray();
        
        for (Item item : itemsArray1) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println();

        //Testing clearCart method
        System.out.println("Clearing cart!");
        shoppingCart.clearCart();
        System.out.println("Number of items in the cart: "+ shoppingCart.getCurrentSize());
     
        
        
	}
}
        
