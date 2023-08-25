package CS586Project;
//Strategy pattern

public class DataStore_vm1 extends DataStore_abstract {
	float temp_p;
	int temp_v;
	int price;
	int cf;

	@Override
	public float getTemp_p() {

		return temp_p;
	}

	@Override
	public void setTemp_p(float temp_p) {
		this.temp_p = temp_p;
	}

	@Override
	public int getTemp_v() {

		return temp_v;
	}

	@Override
	public void setTemp_v(int temp_v) {
		this.temp_v = temp_v;
	}

	@Override
	public int getPrice() {

		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getCf() {

		return cf;
	}

	@Override
	public void setCf(int cf) {
		this.cf += cf;
	}
	
	@Override
	public  void zeroCf() {
		this.cf = 0;
	}

	@Override
	public float getPriceF() {

		return 0;
	}

	@Override
	public void setPrice(float price) {
	}

	@Override
	public float getCfF() {

		return 0;
	}

	@Override
	public void setCf(float cf) {
	}
	
	

	@Override
	public float getTemp_vF() {
		
		return 0;
	}

	@Override
	public void setTemp_v(float temp_v) {
	}
}
