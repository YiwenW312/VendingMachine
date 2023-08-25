package CS586Project;
//Strategy pattern

public class ReturnCoins_vm1 extends ReturnCoins_abstract{

	@Override
	public void returnCoins(DataStore_abstract DS) {
		DS.setCf(0);
		System.out.println("Coins returned. ");
	}

}
