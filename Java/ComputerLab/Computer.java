
public class Computer {

	private String serialNum;
	private String manu;
	private int made;
	
	private int purchase;
	
	private double proSpeed;
	private int ram;
	private int expire;
	
	

	public Computer(){
		this.setSerialNum("XY1234");
		this.setManu("dell");
		this.setMade(2010);
		this.purchase = 2011;
		this.setProSpeed(3.5);
		this.setRam(8);
		this.setExpire(2020);

	}
	
	public Computer(String serialNum,String manu,int made,int purchase,double proSpeed,int ram,int expire){
		this.setSerialNum(serialNum);
		this.setManu(manu);
		this.setMade(made);
		this.purchase = purchase;
		this.setProSpeed(proSpeed);
		this.setRam(ram);
		this.setExpire(expire);

	}
	
	
	/**
	 * @return the serialNum
	 */
	public String getSerialNum() {
		return serialNum;
	}

	/**
	 * @param serialNum the serialNum to set
	 */
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	/**
	 * @return the manu
	 */
	public String getManu() {
		return manu;
	}

	/**
	 * @param manu the manu to set
	 */
	public void setManu(String manu) {
		this.manu = manu;
	}

	/**
	 * @return the made
	 */
	public int getMade() {
		return made;
	}

	/**
	 * @param made the made to set
	 */
	public void setMade(int made) {
		this.made = made;
	}
	
	/**
	 * @return the purchase
	 */
	public int getPurchase() {
		return purchase;
	}

	/**
	 * @param purchase the purchase to set
	 */
	public void setPurchase(int purchase) {
		this.purchase= purchase;
	}

	/**
	 * @return the proSpeed
	 */
	public double getProSpeed() {
		return proSpeed;
	}

	/**
	 * @param proSpeed the proSpeed to set
	 */
	public void setProSpeed(double proSpeed) {
		this.proSpeed = proSpeed;
	}

	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * @return the expire
	 */
	public int getExpire() {
		return expire;
	}

	/**
	 * @param expire the expire to set
	 */
	public void setExpire(int expire) {
		this.expire = expire;
	}
	
	//compare method for speed
	public boolean compareSpeed(double sum4){
		if(this.proSpeed> sum4){
		return true;	
		}
		return false;
	}
	
	
	//compare method for ram size
	public boolean compareRam(int compare){
		if(this.ram> compare){
		return true;	
		}
		return false;
	}
	
	//compare method for age
	public boolean compareAge(int compare){
		if(this.made>= compare){
		return true;	//RETURNS TRUE IF NEWER
		}
		return false;
	}
	
	public String toString(){
		String a = "Serial number: "+this.serialNum;
		a+= "\nManufacturer: "+ this.manu;
		a+= "\nYear of made: " + this.made;
		a+= "\nYear of purchase: " + this.purchase;
		a+= "\nSpeed: "+this.proSpeed;
		a+= "\nRAM: "+this.ram;
		a+= "\nexpiry: "+this.expire;
		return a+"\n";
	}

}
