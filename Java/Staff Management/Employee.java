/**
 * 
 * This is the abstract class, where the classes
 * FullTimeStaff and PartTimeStaff refer to.
 * The constructor takes three main fields,
 * employee number first name, and last name.
 * @author Aarsh Patel
 * 
 *Parent class
 */
abstract class Employee {
	//employee fields
	protected double employeeNumber;
	protected String firstName;
	protected String lastName;
	

	//constructor for employee class
	public Employee(double employeeNumber, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.employeeNumber=employeeNumber; 
		this.firstName=firstName; 
		this.lastName=lastName;
	}
	//abstract pay method
	public abstract double pay();
	//abstract deductSickDay method
	public abstract double deductSickDay(double numDays);
	//abstract resetSickDay method
	public abstract boolean resetSickDay();
	//abstract printPayStub method
	public abstract String printPayStub();
	//abstract toString method
	public String toString(){
		return("Employee number: "+Math.round(employeeNumber)+"\nFirst name: "+ firstName+ "\nLast name: "+ lastName);
	}

}