package CS586Project;
//State pattern (De-centralized)

public class MDA_EFSM {
	State_abstract ST;
	State_abstract state_list[];
	int k = 0;
	int A[];

	public void setStateList(State_abstract s_list[]) {
		this.state_list = s_list;
		this.ST = state_list[3];
	}

	public void changestate(int index) {
		ST = state_list[index];
		System.out.println("State changed to S" + index);
	}

	public void create() {
		ST.create();
	}

	public void insert_cups(int n) {
		ST.insert_cups(n);
	}

	public void coin(int f) {
		ST.coin(f);
	}

	public void card() {
		ST.card();
	}

	public void cancel() {
		ST.cancel();
	}

	public void set_price() {
		ST.set_price();
	}

	public void dispose_drink(int d) {
		ST.dispose_drink(d);
	}

	public void additive(int a) {
		ST.additive(a);
	}
}
