/*Create  a base class Fruit which has name ,taste and size as its attributes.
 *  A method called eat() is created which describes the name of the fruit and its taste.  
 *  Inherit the same in 2 other class Apple and Orange and 
 *  override the eat() method to represent each fruit taste.*/

package Tree;

public class Main {
	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.eat("Apple", "Sweet");
		Orange o = new Orange();
		o.eat("Orange", "sour");
		
	}
}
