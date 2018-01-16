package learn_java;
import java.util.Comparator;
import java.util.TreeSet;
class Book  {
	
	public String title;
	public double price;
	public Book(String title,double price){
		this.title = title;
		this.price = price;
		
	}
	public String getTitle(){ return(title);  }
	public double getPrice(){ return(price);  }
}

class MyClass implements Comparator{}
public class TreeSetComparator {

	public static void main(String[] args){
		
		Book b1,b2,b3;
		b1 = new Book("PHP",300.00);
		b2 = new Book("Java",500.00);
		b3 = new Book("C",400.00);
		
		TreeSet t = new TreeSet();
	}
}
