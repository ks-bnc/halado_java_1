package main;

public interface StoreReaderInterface {
	Product remove(int index) throws StoreEmptyException;
}
