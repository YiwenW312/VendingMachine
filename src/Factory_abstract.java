package CS586Project;
//Abstract factory pattern

public abstract class Factory_abstract {
	public abstract DataStore_abstract getDataStore();
	public abstract Cancel_abstract getCancel_obj();
	public abstract DisposeDrink_abstract getDisposeDrink_obj();
	public abstract DisposeAdditive_abstract getDisposeAdditive_obj();
	public abstract ReturnCoins_abstract getReturnCoins_obj();
	public abstract IncreaseCF_abstract getIncreaseCF_obj();
	public abstract StorePrice_abstract getStorePrice_obj();
	public abstract ZeroCF_abstract getZeroCF_obj();
}
