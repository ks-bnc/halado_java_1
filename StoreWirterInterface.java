package main;

public interface StoreWirterInterface {
	void add(Product product) throws StoreFullException;
}
