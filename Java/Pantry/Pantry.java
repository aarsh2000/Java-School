/**
 * @author aarsh patel
 * 
 * This program allows a user to pick a jam from
 * Mother Hubbard's pantry. Choose from 3 jams!
 * 
 *
 */
public class Pantry {

	/**
	 * creates three jam objects (from Jam class)
	 */
	public Jam oneJ;
	public Jam twoJ;
	public Jam threeJ;


	/**
	 * Pantry constructor takes in three inputs
	 * @param one Jam	
	 * @param two Jam
	 * @param three Jam
	 */
	public Pantry(Jam one, Jam two, Jam three){
		this.oneJ = one;
		this.twoJ = two;
		this.threeJ = three;
	}
	/**
	 * Spread instance method calls spread() and empty() from 
	 * Jam class
	 * @param x Jam object
	 * @param rm Quantity of spread
	 */
	public void spread(Jam x, double rm){
		x.empty();//checks if jam if empty from jam class
		x.spread(rm); //spreads jam


	}
	/**
	 * converts to list, containing all three jams
	 * @return list of jams
	 */
	public String toStr() {
		return ("The Jams are: \n1." + oneJ.toString() +"\n2."+ twoJ.toString()+"\n3."+ threeJ.toString());

	}


}