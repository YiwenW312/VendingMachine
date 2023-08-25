package CS586Project;
//State pattern (De-centralized)

public class State_S0 extends State_abstract {

	public State_S0(MDA_EFSM md, Output_processor op) {
		super(md, op);
	}
	@Override
	public void insert_cups(int n) {
		if(n > 0) {
			MD.k += n;
			MD.changestate(1);
		}
		OP.ZeroCF();
	}
	
	@Override
	public void coin(int f) {
		OP.ReturnCoins();
	}
	
	@Override
	public void create() {
	} 
	
	@Override
	public void card() {
	}

	@Override
	public void cancel() {
	}

	@Override
	public void set_price() {
	}

	@Override
	public void dispose_drink(int d) {
	}

	@Override
	public void additive(int a) {
	} 
}
