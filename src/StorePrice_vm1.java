package CS586Project;
//Strategy pattern

public class StorePrice_vm1 extends StorePrice_abstract{

	@Override
	public void storePrice(DataStore_abstract DS, int price) {
		DS.setPrice(price);
	}


	@Override
	public void storePrice(DataStore_abstract DS, float price) {
		DS.setPrice((int)price);
	}

}
