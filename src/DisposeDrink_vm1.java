package CS586Project;
//Strategy pattern

public class DisposeDrink_vm1 extends DisposeDrink_abstract{
	
	@Override
	public void dispose(int d) {
		if(d == 1)
			System.out.println("A cup of tea is disposed. ");
		if(d == 2)
			System.out.println("A cup of chocolate is disposed. ");
	}
}
