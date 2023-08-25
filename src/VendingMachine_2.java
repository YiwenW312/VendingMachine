package CS586Project;

public class VendingMachine_2 {
	Factory_abstract AF;
	DataStore_abstract DS;
	MDA_EFSM MD;

	public void set_MDAEFSM(MDA_EFSM md) {
		MD = md;
	}

	public void set_factory(Factory_abstract abs_fact) {
		AF = abs_fact;
	}

	public void set_datestore() {
		DS = AF.getDataStore();
	}

	public void CREATE(float p) {
		if (p > 0) {
			DS.setTemp_p(p);
			MD.create();
		}
	}

	public void SetPrice(float p) {
		if (p > 0) {
			DS.setTemp_p(p);
			MD.set_price();
		}
	}

	public void COIN(float v) {
		DS.setTemp_v(v);

		if (DS.getTemp_vF() + DS.getCfF() >= DS.getPriceF()) {
			MD.coin(1);
		} else if (DS.getTemp_vF() + DS.getCfF() < DS.getPriceF()) {
			MD.coin(0);
			System.out.println("Total amount inserted: " + DS.getCfF());
		}
	}

	public void SUGAR() {
		MD.additive(0);
	}

	public void CREAM() {
		MD.additive(1);
	}

	public void COFFEE() {
		MD.dispose_drink(1);
	}

	public void Insert_Cups(int n) {
		MD.insert_cups(n);
	}

	public void CANCEL() {
		MD.cancel();
	}

}
