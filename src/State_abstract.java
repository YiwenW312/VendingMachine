package CS586Project;
//State pattern (De-centralized)

public abstract class State_abstract {
	
	Output_processor OP;
	MDA_EFSM MD;
	
	
	public State_abstract(MDA_EFSM md, Output_processor op) {
		this.MD = md;
		this.OP = op;		
	}
	
	public abstract void create();
	public abstract void insert_cups(int n);
	public abstract void coin(int f);
	public abstract void card();
	public abstract void cancel();
	public abstract void set_price();
	public abstract void dispose_drink(int d);
	public abstract void additive(int a);

}

