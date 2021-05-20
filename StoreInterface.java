package main;

public interface StoreInterface extends StoreReaderInterface, StoreWirterInterface {
	public void reset();
	public int getProductCount();
}
