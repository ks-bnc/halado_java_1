package main;

import java.util.ArrayList;
//exception a teli raktarhoz
class StoreFullException extends Exception {
	StoreFullException(String s){
		super(s);
	}
}
//exception az ures raktarhoz
class StoreEmptyException extends Exception {
	StoreEmptyException(String s){
		super(s);
	}
}

public class Store implements StoreInterface{

	private ArrayList<Product> elements;
	private int maxCount = 20;
	private Object Product;

	public Store() {
		elements = new ArrayList<Product>();
	}


	//addoljuk a productot, de elotte megnezzuk meddig van a raktar. ha elements.size()+1 nagyobb mint a max akkor dobja
	//az exception, ha nem, else ágra ugrik és hozzaadja
	public void add(Product product) throws StoreFullException{
		if(elements.size()+1 > maxCount) throw new StoreFullException("store is full");
		else {
			elements.add(product); 
			//counter++;
		}
	}
	//remove metodus a raktarbol valo kivetelre, exception ha ures
	public Product remove(int index) throws StoreEmptyException{
		if(elements.size()== 0) throw new StoreEmptyException("store is empty");
		else {
			Product element = elements.get(index);
			elements.remove(index); 
			//counter--;
			return element;
		}
	}
	//reset metodus ami torli a raktar tartalmat
	public void reset() {
		elements.clear();
	}
	//getproductcount metodus ami visszaadja a raktari termekek szamat
	public int getProductCount() {
		return elements.size();
	}

}
