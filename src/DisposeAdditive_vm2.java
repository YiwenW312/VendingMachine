package CS586Project;
//Strategy pattern

public class DisposeAdditive_vm2 extends DisposeAdditive_abstract{

	@Override
	public void dispose(int[] A) {
		if(A[0] == 1)
			System.out.println("Sugar is disposed.");
		if(A[1] == 1)
			System.out.println("Cream is disposed.");
		
	}
	
}
