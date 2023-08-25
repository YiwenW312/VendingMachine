package CS586Project;
//Strategy pattern

public class IncreaseCF_vm2 extends IncreaseCF_abstract{

	@Override
	public void increaseCF(DataStore_abstract DS, float cf) {
		DS.setCf(cf);
	}
	
	public void increaseCF(DataStore_abstract DS, int cf) {

	}
	
}