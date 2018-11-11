// CCreate a class called Author is designed as follows:
//
//It contains:
//• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’).
//• One constructor to initialize the name, email and gender with the given values.
//
//And, a class called Book is designed as follows:
//It contains:
//• Four private instance variables: name (String), author (of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written by one author.
//• One constructor which constructs an instance with the values given.
//• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name and author.
//Write the class Book (which uses the Author class written earlier). 
//Try:
//1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
//2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

package Library;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	Book(String name, Author author, double price, int qty)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	
	public Author getAuthor() {
		return author;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
