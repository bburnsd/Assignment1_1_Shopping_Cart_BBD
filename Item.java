/**
 * A class that instantiates an item with a name and a price
 * @author bbdav
 */
public class Item{
private String Name;
private double price;

/**
 * the default constructor makes an item with the name null and a price of 1.00
 */
public Item() {
	this.Name = "null";
	this.price=1.00;
}//end default constructor

/**
 * the preferred constructor creates an item with a user inputed name and price
 * @param Name  The desired name of the Item
 * @param price  The desired price of the Item
 */
public Item(String Name, double price) {
	this.Name=Name;
	this.price=price;
}//end preferred constructor

/**
 *returns a string with all of the information of the item
 */
@Override
public String toString() {
	return "Item [Name=" + Name + ", price=" + price + "]";
}//end toString

/**
 * Checks the name of the item
 * @return the name of the item
 */
public String getName() {
	return Name;
}//end getName

/**
 * Changes the name of the item to a user inputed name
 * @param name  The desired name of the Item
 */
public void setName(String name) {
	Name = name;
}//end setName

/**
 * Checks the price of the item
 * @return the price of the item
 */
public double getPrice() {
	return price;
}//end getPrice

/**
 * changes the price of the item to a user inputed price
 * @param price  The desired price of the item
 */
public void setPrice(int price) {
	this.price = price;
}//end setPrice
}//end Item
