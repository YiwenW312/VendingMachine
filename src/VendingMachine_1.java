package CS586Project;

public class VendingMachine_1 {
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

	public void create(int p) {
		if (p > 0) {
			DS.setTemp_p(p);
			MD.create();
		}
	}

	public void set_price(int p) {
		if (p > 0) {
			DS.setTemp_p(p);
			MD.set_price();
		}
	}

	public void coin(int v) {
		DS.setTemp_v(v);
		if (DS.getTemp_v() + DS.getCf() >= DS.getPrice()) {
			MD.coin(1);
		} else if (DS.getTemp_v() + DS.getCf() < DS.getPrice()) {
			MD.coin(0);
			System.out.println("Total amount inserted: " + DS.getCf());
		}
	}

	public void card(float x) {
		if (x > DS.getPrice())
			MD.card();
	}

	public void sugar() {
		MD.additive(0);
	}

	public void tea() {
		MD.dispose_drink(1);
	}

	public void chocolate() {
		MD.dispose_drink(2);
	}

	public void insert_cups(int n) {
		MD.insert_cups(n);
	}

	public void setTemp_p(float p) {
		DS.setTemp_p(p);
	}

	public void cancel() {
		MD.cancel();
	}

}
