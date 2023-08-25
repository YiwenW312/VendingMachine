package CS586Project;
//Strategy pattern

public abstract class StorePrice_abstract {
	public abstract void storePrice(DataStore_abstract DS, int price);
	public abstract void storePrice(DataStore_abstract DS, float price);
}
