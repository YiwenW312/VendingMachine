package CS586Project;
//Strategy pattern

public class DisposeAdditive_vm1 extends DisposeAdditive_abstract{

	@Override
	public void dispose(int[] A) {
		if(A[0] == 1)
			System.out.println("sugar is disposed.");
	}
	
}
