package CS586Project;
//Strategy pattern

public abstract class DataStore_abstract {
	//get, set methods for variables common for vending machine 1 and 2
	public abstract float getTemp_p();
	public abstract void setTemp_p(float temp_p);
	public abstract void zeroCf();
	
	//vending machine 1
	
	public abstract int getTemp_v();
	public abstract void setTemp_v(int temp_v);
	
	public abstract int getPrice();
	public abstract void setPrice(int price);
	
	public abstract int getCf();
	public abstract void setCf(int cf);
	
	
	
	//vending machine 2
	
	public abstract float getTemp_vF();
	public abstract void setTemp_v(float temp_v);
	
	public abstract float getPriceF();
	public abstract void setPrice(float price);
	
	public abstract float getCfF();
	public abstract void setCf(float cf);
}
