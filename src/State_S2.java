package CS586Project;
//State pattern (De-centralized)

public class State_S2 extends State_abstract {

	public State_S2(MDA_EFSM md, Output_processor op) {
		super(md, op);
	}

	
	@Override
	public void coin(int f) {
		OP.ReturnCoins();
	}
	
	@Override
	public void cancel() {
		OP.ReturnCoins();
		OP.ZeroCF();
		MD.changestate(1);
	}
	
	
	
	@Override
	public void dispose_drink(int d) {
		OP.DisposeDrink(d);
		OP.DisposeAdditive(MD.A);
		if(MD.k > 1) {
			MD.k--;
			MD.changestate(1);
		}
		else if(MD.k == 1) {
			MD.k--;
			MD.changestate(0);
		}
	}
	
	@Override
	public void additive(int a) {
		if (MD.A[a] == 1)
			MD.A[a] = 0;
		else if (MD.A[a] == 0)
			MD.A[a] = 1;
	}

	@Override
	public void create() {
	}

	@Override
	public void card() {
	}

	@Override
	public void insert_cups(int n) {
	}

	@Override
	public void set_price() {
	}
}
