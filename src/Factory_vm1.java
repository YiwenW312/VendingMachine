package CS586Project;
//Abstract factory pattern

public class Factory_vm1 extends Factory_abstract {
	DataStore_abstract DS;
	Cancel_abstract CL;
	DisposeDrink_abstract DD;
	DisposeAdditive_abstract DA;
	ReturnCoins_abstract RC;
	IncreaseCF_abstract IC;
	StorePrice_abstract SP;
	ZeroCF_abstract ZC;

	@Override
	public DataStore_abstract getDataStore() {
		DS = new DataStore_vm1();
		return DS;
	}

	@Override
	public Cancel_abstract getCancel_obj() {
		CL = new Cancel_vm1();
		return CL;
	}



	@Override
	public DisposeDrink_abstract getDisposeDrink_obj() {
		DD = new DisposeDrink_vm1();
		return DD;
	}

	@Override
	public DisposeAdditive_abstract getDisposeAdditive_obj() {
		DA = new DisposeAdditive_vm1();
		return DA;
	}

	@Override
	public ReturnCoins_abstract getReturnCoins_obj() {
		RC = new ReturnCoins_vm1();
		return RC;
	}

	@Override
	public IncreaseCF_abstract getIncreaseCF_obj() {
		IC = new IncreaseCF_vm1();
		return IC;
	}

	@Override
	public StorePrice_abstract getStorePrice_obj() {
		SP = new StorePrice_vm1();
		return SP;
	}

	@Override
	public ZeroCF_abstract getZeroCF_obj() {
		ZC = new ZeroCF_vm1();
		return ZC;
	}

}
