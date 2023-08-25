package CS586Project;
//Strategy pattern

public class DisposeDrink_vm2 extends DisposeDrink_abstract{
	
	@Override
	public void dispose(int d) {
		if(d == 1)
			System.out.println("A cup of coffee is disposed. ");
	}
}
