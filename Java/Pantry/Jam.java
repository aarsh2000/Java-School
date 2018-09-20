/**
 * @author aarsh patel
 * 
 * This program allows a user to pick a jam from
 * Mother Hubbard's pantry. Choose from 3 jams!
 * 
 *
 */
public class Jam {
	/**
	 * Required fields to build jam objects
	 */
	private String con;
	private String date;
	private double size;
	/**
	 * Default constructor ^_^
	 */
	public Jam() {
		this.con=("HAM JAM");
		this.date = "March 9th 1889";
		this.size=1;

	}
	/**
	 * Assigns with three inputs
	 * @param con (content of jam)
	 * @param date (date of jam)
	 * @param size (size of jam)
	 */
	public Jam(String con, String date, double size) {
		this.con=con;
		this.date = date;
		this.size=size;

	}

	/**
	 * @return the con of the jam
	 */
	public String getCon() {
		return con;
	}

	/**
	 * @param con the con to set
	 */
	public void setCon(String con) {
		this.con = con;
	}

	/**
	 * @return the date of the jam
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return the size of the jam
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * 
	 * @return true if empty, else returns false if not empty
	 */
	public boolean empty() {
		if(this.size<=0) {
			System.out.println("No jam in the jar!");//printed it here, for neatness in pantry class
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param x spreads x amount of the jam
	 */
	public void spread(double x) {
		double r = this.size - x;
		if(r>0) {

			this.size = r;
			System.out.println("Spreading "+size+ " ml of " +con);
		}
		else {
			this.size = 0;
			System.out.println("No jam in the jar!\n");
		}
	}
	/**
	 * converts all jam data to string
	 */
	public String toString() {
		return (this.con+ ", " + this.date + ", "+ this.size+" ml");
	}

}