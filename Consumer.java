package main;

public class Consumer {
	
	//private Store store;
	private StoreReaderInterface store;

	//a cunsumer osztaly letrehoz egy store peldanyt
	public Consumer() {
		store = new Store();
	}

	//metodus ami megprobal kivenni egy termeket a raktarbol
	public Product consume(int product) throws StoreEmptyException {
		return store.remove(product);
	}

}
