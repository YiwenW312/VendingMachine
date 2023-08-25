package CS586Project;
//Strategy pattern

public class ReturnCoins_vm2 extends ReturnCoins_abstract{

	@Override
	public void returnCoins(DataStore_abstract DS) {
		DS.setCf(0);
		System.out.println("Coins returned. ");
	}

}
