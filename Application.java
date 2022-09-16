/**
 * An application class testing all of the different methods of the ShoppingCart class
 * @author bbdav
 */
public class Application {
	
	public static void main(String[] args) {
ShoppingCart myCart = new ShoppingCart(25); //instatiates a shopping cart with max capacity of 25

Item bread = new Item("White Bread", 3.00); //just some items to put into the cart
Item chocolate = new Item("Hershey Chocolate", 1.25);
System.out.println(chocolate.getPrice());

myCart.addItem(bread); //added 2 of the same item to make sure it can add items and to test if it can get frequency of
myCart.addItem(bread);
myCart.addItem(chocolate);

System.out.println(myCart.getFrequencyOf(bread)); //getFrequency Test, should be 2
System.out.println(myCart.currentSize()); //currentSize Test, should be 3
System.out.println(myCart.totalPrice()); //totalPrice test
myCart.listCart();//showing everything in the cart to make sure there are two loaves of bread and a hershey bar

myCart.remove(); //should remove the last item
System.out.println(myCart.currentSize()); //should be 2 if the item was removed
myCart.listCart(); //listing cart again to make sure it removed the last item, which would be the chocolate
System.out.println(myCart.totalPrice()); //making sure the total price changed after removing an item

myCart.addItem(chocolate); //adding chocolate back to test the other remove method
myCart.removeItem(bread); //should remove one of the loaves of bread
myCart.listCart(); //another test to see if the correct item was removed

System.out.println(myCart.isEmpty()); //test to see if the isEmpty method works
myCart.clear(); //test to see if the clear method is working
System.out.println(myCart.isEmpty()); //still testing the isEmpty method
	}
}
