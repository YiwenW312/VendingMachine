package CS586Project;
//State pattern (De-centralized)

//no cups state
public class State_S1 extends State_abstract {

	public State_S1(MDA_EFSM md, Output_processor op) {
		super(md, op);
	}

	@Override
	public void insert_cups(int n) {
		if (n > 0)
			MD.k += n;
	}

	@Override
	public void coin(int f) {
		if (f == 1) {
			OP.IncreaseCF();
			MD.changestate(2);
		} 
		else if (f == 0) {
			OP.IncreaseCF();
			System.out.println("Balance not enough. ");
		}
	}

	@Override
	public void set_price() {
		OP.StorePrice();
	}

	@Override
	public void card() {
		OP.ZeroCF();
		MD.changestate(2);
	}

	@Override
	public void create() {
	}

	@Override
	public void cancel() {
	}

	@Override
	public void dispose_drink(int d) {
	}

	@Override
	public void additive(int a) {
	}

}
