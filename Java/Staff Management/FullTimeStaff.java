/**
 * Part-time staffs are hired with an hourly rate.  
 * Each of them is assigned a certain number of hours per month (same every month).  
 * They do not have any sick day benefit,
 *  i.e., they do not get paid for the days they are absent.
 * @author Aarsh Patel
 *
 *Child class
 */

public class FullTimeStaff extends Employee {

	//fields for FullTimeStaff
	double yearlySickDay=20;
	private double yearlySalary;
	private double sickDaysLeft;
	/**
	 * Constructor for FullTimeStaff
	 * 
	 * @param takes employeeNumber
	 * @param takes firstName for full time staff
	 * @param takes lastName for full time staff
	 * @param takes yearlySalary for full time staff
	 * @param sickDaysLeft for full time staff
	 */
	public FullTimeStaff(double employeeNumber, String firstName,String lastName, double yearlySalary, double sickDaysLeft) {
		// TODO Auto-generated constructor stub
		super(employeeNumber, firstName, lastName); //reference fields from parent class
		this.yearlySalary = yearlySalary;
		this.sickDaysLeft = sickDaysLeft;
	}
	/**
	 * Accessor method for yearly salary
	 * @return yearlySalary
	 */

	public double getYearlySalary() {
		return yearlySalary;
	}
	/**
	 * Mutator method for yearly salary
	 * @return yearlySalary
	 */
	public void setYearlySalary(Double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	/**
	 * Accessor method for sick days left
	 * @return sickDaysLeft
	 */
	public double getSickDaysLeft() {
		return sickDaysLeft;
	}
	/**
	 * Mutator method for sick days left
	 * @return sickDaysLeft
	 */
	public void setSickDaysLeft(Double sickDaysLeft) {
		this.sickDaysLeft = sickDaysLeft;
	}


	@Override
	/**
	 * This method returns the monthly salary
	 * @return the pay 
	 */
	public double pay() {
		// TODO Auto-generated method stub
		return this.yearlySalary/12;
	}

	@Override
	/**
	 * This method returns the total sick days left for full time staff
	 * @return the sickDaysLeft
	 */
	public double deductSickDay(double numDays) {
		// TODO Auto-generated method stub
		if(sickDaysLeft<=0){
			System.out.println("Warning, sick days are over!");
			this.sickDaysLeft = 0;
		}
		this.sickDaysLeft = this.yearlySickDay -(numDays+this.sickDaysLeft);
		

		return this.sickDaysLeft;
	}

	@Override
	/**
	 * This method initialize the sickDaysLeft to zero
	 * @return true
	 */
	public boolean resetSickDay() {
		// TODO Auto-generated method stub
		this.sickDaysLeft = 0;
		return true;
	}

	@Override
	/**
	 * This method returns String including, amount earned, sick days left
	 * @return true
	 */
	public String printPayStub() {
		// TODO Auto-generated method stub
		return (super.toString()+"\nFT"+"\nAmount earned: " + Math.round(this.yearlySalary/12)+"\nSick Days left: "
				+this.sickDaysLeft +"\n");

	}

	/**
	 * This method returns the difference between sick days of two full time staff
	 * @return true
	 */
	public double compareSickDay(FullTimeStaff Other){

		return Math.abs(this.sickDaysLeft - Other.sickDaysLeft);
	}
	/**
	 * This method returns the employee number, first name, and last name, from parent class
	 * @return true
	 */
	public String toString(){
		return super.toString();
	}

}