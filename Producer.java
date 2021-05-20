package main;

public class Producer {

	//private Store store;
	private StoreWirterInterface store;

	//a producer osztaly letrehoz egy store peldanyt
	public Producer() {
		store = new Store();
	}

	//produce metodus, ami letrehoz egy peldanyt es megprobalja azt betenni a raktarba
	public void produce(String productName, String productId) throws StoreFullException {
		store.add(new Product(productName, productId));
	}
	
}
