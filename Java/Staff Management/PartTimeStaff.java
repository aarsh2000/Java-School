/**
 * Part-time staffs are hired with an hourly rate.  
 * Each of them is assigned a certain number of hours per month (same every month).  
 * They do not have any sick day benefit, i.e., they do not get paid for the days they are absent.
 * @author Aarsh Patel
 *
 *Child class 
 */


public class PartTimeStaff extends Employee {

	//fields for PartTimeStaff
	double numHoursAssigned;
	double hourlyRate;
	double sickDaysTaken;


	/**
	 * Constructor for PartTimeStaff
	 * 
	 * @param takes employeeNumber
	 * @param takes firstName for part time staff
	 * @param takes lastName for part time staff
	 * @param takes hourlyRate for part time staff
	 * @param takes numHoursAssigned for part time staff
	 */
	public PartTimeStaff(double employeeNumber, String firstName,String lastName, double hourlyRate,double numHoursAssigned) {
		// TODO Auto-generated constructor stub
		super(employeeNumber, firstName, lastName); //reference fields from parent class
		this.numHoursAssigned = numHoursAssigned;
		this.hourlyRate = hourlyRate;
		this.numHoursAssigned = numHoursAssigned;
	}
	/**
	 * Accessor method for sickDaysTaken
	 * @return sickDaysTaken
	 */
	public double getSickDaysTaken() {
		return sickDaysTaken;
	}
	/**
	 *  Mutator method for sickDaysTaken
	 * @param sets sickDaysTaken
	 */

	public void setSickDaysTaken(Double sickDaysTaken) {
		this.sickDaysTaken = sickDaysTaken;
	}
	/**
	 * Accessor method for HourlyRate
	 * @return HourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	/**
	 * Mutator method for HourlyRate
	 * @return HourlyRate
	 */
	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	/**
	 * Accessor method for numHoursAssigned
	 * @return numHoursAssigned
	 */
	public double getNumHoursAssigned() {
		return this.numHoursAssigned;
	}
	/**
	 * Mutator method for numHoursAssigned
	 * @return numHoursAssigned
	 */
	public void setNumHoursAssigned(Double numHoursAssigned) {
		this.numHoursAssigned = numHoursAssigned;
	}


	@Override
	/**
	 * This method returns the product of the hourly rate and the total hours worked
	 * @return the pay 
	 */
	public double pay() {
		// TODO Auto-generated method stub
		return this.hourlyRate*(this.numHoursAssigned-this.sickDaysTaken*8);
	}

	@Override
	/**
	 * This method returns the total sick days taken for part time staff
	 * @return the sickDaysTaken
	 */
	public double deductSickDay(double numDays) {
		// TODO Auto-generated method stub
		this.sickDaysTaken += numDays;

		return this.sickDaysTaken;
	}

	@Override
	/**
	 * This method initialize the sickDaysTaken to zero
	 * @return true
	 */
	public boolean resetSickDay() {
		// TODO Auto-generated method stub
		this.sickDaysTaken = 0;
		return true;
	}

	@Override
	/**
	 * This method returns String including, amount earned, sick days taken, and number of hours assigned
	 * @return true
	 */
	public String printPayStub() {
		// TODO Auto-generated method stub
		return (super.toString()+"\nPT"+"\nAmount earned: " +pay()+ "\nSick days taken: "+this.sickDaysTaken
				+"\nNumber of hours assigned "+(this.numHoursAssigned-(this.sickDaysTaken*8))+"\n");
	}
	/**
	 * This method returns the difference between sick days of two part time staff
	 * @return true
	 */
	public double compareSickDay(PartTimeStaff Other){		
		return Math.abs(this.sickDaysTaken - Other.sickDaysTaken);
	}
	/**
	 * This method returns the employee number, first name, and last name, from parent class
	 * @return true
	 */
	public String toString(){
		return super.toString();
	}


}
