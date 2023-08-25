package CS586Project;

//Strategy pattern

public class DataStore_vm2 extends DataStore_abstract {
	float temp_p;
	float temp_v;
	float price;
	float cf;
	
	@Override
	public float getTemp_p() {

		return temp_p;
	}

	@Override
	public void setTemp_p(float temp_p) {
		this.temp_p = temp_p;
	}

	@Override
	public float getTemp_vF() {

		return temp_v;
	}

	@Override
	public void setTemp_v(float temp_v) {
		this.temp_v = temp_v;
	}

	@Override
	public float getPriceF() {

		return price;
	}

	@Override
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public float getCfF() {

		return cf;
	}

	@Override
	public  void zeroCf() {
		this.cf = 0;
	}
	
	@Override
	public void setCf(float cf) {
		this.cf += cf;
	}

	@Override
	public int getPrice() {

		return 0;
	}

	@Override
	public void setPrice(int price) {
	}

	@Override
	public int getCf() {

		return 0;
	}

	@Override
	public void setCf(int cf) {
	}

	@Override
	public int getTemp_v() {
		
		return 0;
	}

	@Override
	public void setTemp_v(int temp_v) {
	}
}
