package CS586Project;
//State pattern (De-centralized)

public class State_start extends State_abstract{

	public State_start(MDA_EFSM md, Output_processor op) {
		super(md, op);
		
	}
	

	@Override
	public void create() {
		OP.StorePrice();
		MD.changestate(0);
	}

	@Override
	public void insert_cups(int n) {
	}

	@Override
	public void coin(int f) {
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
