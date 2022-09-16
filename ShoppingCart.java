import java.text.NumberFormat;
/**
 * A class that uses the ResizableArrayBag data structure to form a cart with several different items with different names and prices
 * The cart can be modified to remove items and check the total price of all of the items
 * @author bbdav
 */
public class ShoppingCart{
private ResizableArrayBag<Item> shopCart = new ResizableArrayBag<Item>();
private NumberFormat c = NumberFormat.getCurrencyInstance();
/**
 * the default constructor makes a cart with a max capacity of 25
 */
public ShoppingCart() {
	shopCart = new ResizableArrayBag();
}//end default constructor

/**
 * the preferred constructor makes a cart with a custom capacity that the user inputs
 * @param capacity  The integer capacity desired
 */
public ShoppingCart(int capacity) { 
	shopCart = new ResizableArrayBag(capacity);
}//end preferred constructor

/**
 * checks if the cart is empty
 * @return True or False
 */
public boolean isEmpty() { 
	return shopCart.isEmpty();
}//end isEmpty

/**
 * adds a user inputed item to the cart
 * @param item  The item to be added to the cart
 * @return True
 */
public boolean addItem(Item item) {
	return shopCart.add(item);
}//end addItem

/**
 * checks how many there are of a certain item and returns the amount of how many times that item is in the cart
 * @param entry  Item to be counted in the cart
 * @return Int value of how many times the item was in the cart
 */
public int getFrequencyOf(Item entry) {
	return shopCart.getFrequencyOf(entry);
}//end getFrequencyOf

/**
 * Checks how many items are in the cart
 * @return Int value of how many items are in the cart
 */
public int currentSize() {
	return shopCart.getCurrentSize();
}//end currentSize

/**
 * Clears the cart of all items
 */
public void clear() {
	shopCart.clear();
}//end clear

/**
 * Adds up all the prices of the items in the cart
 * @return the total price of all the items
 */
public String totalPrice() {
	double totalPrice=0;
	double currentItemPrice;
	Item currentItem;
	Object[] tempCart = shopCart.toArray();
	for(int i=0;i<shopCart.getCurrentSize();i++) {
		currentItem = (Item)tempCart[i];
		totalPrice += currentItem.getPrice();
	}
	double total = totalPrice;
	return c.format(total);
}//end totalPrice

/**
 * removes the most recently added item to the cart
 * @return The removed entry, if the remove was successful, or null
 */
public Item remove() {
	return shopCart.remove();
}//end remove

/**
 * prints to the screen all of the items currently inside of the cart
 */
public void listCart() {
	Object[] tempCart = shopCart.toArray();
	Item currentItem;
	for(int i=0;i<shopCart.getCurrentSize();i++) {
		currentItem = (Item)tempCart[i];
		System.out.println(currentItem.toString());
	}
}//end listCart

/**
 * removes the user inputed item from the cart
 * @param item  Item to be removed from the cart
 * @return True if the remove was successful, false if it wasn't
 */
public boolean removeItem(Item item) {
	return shopCart.remove(item);
}//end removeItem
}//end ShoppingCart