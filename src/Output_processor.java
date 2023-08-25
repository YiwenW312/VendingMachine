package CS586Project;

public class Output_processor {
	Factory_abstract AF;
	DataStore_abstract DS;
	StorePrice_abstract SP;
	ReturnCoins_abstract RC;
	DisposeDrink_abstract DD;
	DisposeAdditive_abstract DA;
	IncreaseCF_abstract IC;
	ZeroCF_abstract ZC;

	public void setFactory(Factory_abstract abs_fact) {
		AF = abs_fact;
	}

	public void setDataStore(DataStore_abstract ds) {
		DS = ds;
	}

	public void IncreaseCF() {
		IC = AF.getIncreaseCF_obj();
		IC.increaseCF(DS, DS.getTemp_vF());
		IC.increaseCF(DS, DS.getTemp_v());
	}

	public void StorePrice() {
		SP = AF.getStorePrice_obj();
		SP.storePrice(DS, DS.getTemp_p());
	}

	public void ZeroCF() {
		ZC = AF.getZeroCF_obj();
		ZC.ZeroCF(DS);
	}

	public void ReturnCoins() {
		RC = AF.getReturnCoins_obj();
		RC.returnCoins(DS);
	}

	public void DisposeDrink(int d) {
		DD = AF.getDisposeDrink_obj();
		DD.dispose(d);
		ZeroCF();
	}

	public void DisposeAdditive(int A[]) {
		DA = AF.getDisposeAdditive_obj();
		DA.dispose(A);
	}

}
