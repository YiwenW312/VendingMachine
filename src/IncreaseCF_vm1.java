package CS586Project;
//Strategy pattern

public class IncreaseCF_vm1 extends IncreaseCF_abstract{

	@Override
	public void increaseCF(DataStore_abstract DS, float cf) {

	}

	public void increaseCF(DataStore_abstract DS, int cf) {
		DS.setCf(cf);
	}
	
}
