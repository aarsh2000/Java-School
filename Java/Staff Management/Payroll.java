/**
 * This class has the purpose of holding an array.
 * This array is exclusively for the staff.
 * @author Aarsh Patel
 * 
 */
//imports for scanner, load and save file 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Payroll {
	//static fields for payRoll
	static int size;
	//for all employees
	static Employee staffList[] ;
	//for employee type either "FT" or "PT" (corresponding to staffList[])
	static String work [];
	// active boolean returns false if staffList[] is NULL
	static boolean active = false; 
	//scanner object 
	static Scanner sc = new Scanner (System.in);

	
/**
 * This method lists all employees
 */
	public static void listAllEmployee() {
		// TODO Auto-generated method stub
		System.out.print("Listing all staff");
		Payroll.typeWritter("........\n", 25);
		
		if(active == false) //checks if array is NULL
		{
			Payroll.typeWritter("ERROR 1, No staff found!", 50);
		}
		else 
		{
			for(int i = 0; i < staffList.length; i++)//iterates through staffList array
			{
				System.out.println(staffList[i].toString()+"\n"); //outputs employee at each itteration
			}
		}
	}
	/**
	 * This method prints all pay stubs
	 */
	public static void printAllPayStub() {
		// TODO Auto-generated method stub
		System.out.print("Printing all pay stubs");
		Payroll.typeWritter("......\n", 150);
		//intialize default/empty FullTimeStaff and PartTimeStaff objects for later use
		FullTimeStaff full = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
		PartTimeStaff part = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
		
		for(int i = 0; i < staffList.length; i++)//itterates through array
		{
			if(work[i].equalsIgnoreCase("FT"))//checks for full time type in work array 
			{
				full=(FullTimeStaff) staffList[i];//casts employee to full time staff
				System.out.println(full.printPayStub());//outputs pay stub
			}
			if(work[i].equalsIgnoreCase("PT"))//checks for part time type in work array
			{
				part=(PartTimeStaff) staffList[i];//casts employee to part time staff
				System.out.println(part.printPayStub());//outputs pay stub
			}


		}

	}
	/**
	 * This method saves file
	 */
	public static void saveStaffList(String fn) {
		// TODO Auto-generated method stub
		System.out.println("Saving staff to file: "+fn);
		Payroll.typeWritter(".......", 150);

		File file = new File(fn); //sets file name
		PrintWriter pw=null;
		try {
			pw = new PrintWriter(file);
			// write size to file
			pw.println(staffList.length); //writes # staff

			for(int i=0; staffList.length>i; i++){ 
				
				//writes super fields, employee number, first name, and last name
				pw.println(staffList[i].employeeNumber); 
				pw.println(staffList[i].firstName);
				pw.println(staffList[i].lastName);

				if(work[i].equalsIgnoreCase("FT"))//checks for full time type in work array 
				{
					FullTimeStaff full = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
					full = (FullTimeStaff) staffList[i];//casts employee to full time staff
					//writes fields for full time staff
					pw.println(full.getYearlySalary());
					pw.println(full.getSickDaysLeft());
				}

				if(work[i].equalsIgnoreCase("PT"))//part for full time type in work array 
				{
					PartTimeStaff part = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
					part = (PartTimeStaff) staffList[i];//casts employee to part time staff
					//writes fields for part time staff
					pw.println(part.getHourlyRate());
					pw.println(part.getNumHoursAssigned());	
				}


			}//end of for loop
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pw != null){
				pw.close();
			}
		} 

		System.out.println("\nDone.\n");
	}
	/**
	 * This method loads a file
	 */
	public static void loadStaffList(String fn) {
		// TODO Auto-generated method stub
		double eNum=0, salary = 0, sickDays=0;
		String fName=null, lName=null, type=null;
		type = null;

		Scanner s = null;
		try {

			s = new Scanner(new BufferedReader(new FileReader(fn))); //finds file name
			size = Integer.parseInt(s.next());//loads size from file  
			//intializes size to arrays
			staffList= new Employee [size];
			work= new String[size];
			active = true;//returns true if file has loaded successfully
			System.out.print("Loading staff from file: "+fn);
			Payroll.typeWritter(".......", 150);
			System.out.println("\nDone.\n");
			for(int i = 0; i < staffList.length; i++)
			{
				//Collects required fields
				eNum= Double.parseDouble(s.next());  
				fName = s.next();
				lName  = s.next();
				type = s.next();
				work[i]=type;//sets type to work array
				salary = Double.parseDouble(s.next());
				sickDays = Double.parseDouble(s.next());

				if(type.equalsIgnoreCase("FT"))//checks for full time type 
				{
					FullTimeStaff x = new FullTimeStaff(eNum, fName, lName, salary, sickDays);
					staffList[i]= x;//assigns employee
				}
				if(type.equalsIgnoreCase("PT"))//checks for part time type in work array
				{
					//In this case assume that salary represents hourlyRate and sickDays represents numHoursAssigned
					PartTimeStaff y = new PartTimeStaff(eNum, fName, lName, salary, sickDays);
					staffList[i]= y;//assigns employee
				}

			}

		//if file is not found
		} catch( FileNotFoundException e){
			Payroll.typeWritter(("File was not found!"),100);
		} finally {
			if (s!=null){
				s.close();//closes file
			}
		}

	}
	/**
	 * This method calculates the average salary for full time staff
	 */
	public static double averageSalary() {
		// TODO Auto-generated method stub
		System.out.print("Average salary for full-time staff is");
		Payroll.typeWritter(".....", 150);
		//Initializes fields
		double avg = 0;
		int counter =0;
		FullTimeStaff full = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
		
		for(int i = 0; i < staffList.length; i++)//iterates through array
		{
			if(work[i].equalsIgnoreCase("FT")) //checks for full time type in work array
			{		
				full = (FullTimeStaff) staffList[i];//casts staffList to FullTimeStaff
				avg += (full.getYearlySalary());//adds to total average
				counter++;//for denominator 
			}
		}

		 return (avg/counter);//returns average
	}
	/**
	 * This method calculates the average hourly rate
	 */
	public static double averageHourlyRate() {
		// TODO Auto-generated method stub
		System.out.print("Average hourly rate for part-time staff is");
		Payroll.typeWritter(".....", 150);
		//initalizes fields
		double avg = 0;
		int counter =0;
		PartTimeStaff part = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
		
		for(int i = 0; i < staffList.length; i++)//Iterates through array
		{
			if(work[i].equalsIgnoreCase("PT")) //checks for part time type in work array
			{			
				part = (PartTimeStaff) staffList[i];//casts staffList to PartTimeStaff
				avg += (part.getHourlyRate());//adds total average
				counter++;//for denominator
			}
		}

		return  (avg/counter);//returns averages

	}
	/**
	 * This method returns the full staff with the most absents
	 */
	public static String mostAbsentFullTime() {
		// TODO Auto-generated method stub
		Payroll.typeWritter(".....", 150);
		//Initializes fields
		double compare = 0;
		double most = 0; //Least sick days left means most sick days taken
		FullTimeStaff full = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
		FullTimeStaff absent = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
		
		for(int i = 0; i < staffList.length; i++)//Iterates through array
		{
			if(work[i].equalsIgnoreCase("FT"))//checks for full time type in work array 
			{	
				full = (FullTimeStaff) staffList[i];//casts staffList to FullTimeStaff
				compare = full.getSickDaysLeft();//assigns sick days of employee to compare
				if(most<=compare)//checks for greatest value 
				{
					//assigns all values
					most = compare;
					absent = full;
				}
			}
		}
		//returns employee with most absents
		return ("\nFull time staff with most sick days taken is \n" + absent.toString() +"\nwith "+most+" sick days." );
	}
	/**
	 * This method returns the part staff with the most absents
	 */
	public static String mostAbsentPartTime() {
		// TODO Auto-generated method stub
		Payroll.typeWritter(".....", 100);
		//Initializes fields
		double compare = 0;
		double most = 0; //Least sick days left means most sick days taken
		PartTimeStaff part = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
		PartTimeStaff absent = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
		
		for(int i = 0; i < staffList.length; i++)//Iterates through array
		{
			if(work[i].equalsIgnoreCase("PT")) //checks for part time type in work array 
			{	
				part = (PartTimeStaff) staffList[i];//casts staffList to FullTimeStaff
				compare = part.getSickDaysTaken();//assigns sick days of employee to compare
				if(most<=compare) //checks for greatest value 
				{
					//assigns all values
					most = compare;
					absent = part;
				}
			}
		}
		//returns employee with most absents
		return("\nPart time staff with most sick days taken is \n" + absent.toString() +"\nwith "+most+" sick days." );

	}
/**
 * This method resets the sick days for all full time staff
 */
	public static void yearlySickDayReset() {
		// TODO Auto-generated method stub
		System.out.print("Reseting sickdays for all full-time: ");
		Payroll.typeWritter(".....", 150);
		FullTimeStaff full = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
		
		for(int i = 0; i < staffList.length; i++)//Iterates through array
		{
			if(work[i].equalsIgnoreCase("FT")) //checks for full time type in work array 
			{	
				full = (FullTimeStaff) staffList[i];//casts staffList to FullTimeStaff
				full.resetSickDay();//calls reset method
				staffList[i] = full;//assigns employee
			}
		}
	}
	/**
	 * This method resets the sick days for all part time staff
	 */
	public static void monthlySickDayReset() {
		// TODO Auto-generated method stub
		System.out.print("Reseting sickdays for all part-time: ");
		Payroll.typeWritter(".....", 150);
		PartTimeStaff part = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
		for(int i = 0; i < staffList.length; i++)//Iterates through array
		{
			if(work[i].equalsIgnoreCase("PT")) //checks for part time type in work array 
			{	
				part = (PartTimeStaff) staffList[i];//casts staffList to PartTimeStaff
				part.setSickDaysTaken(0.0);//sets to 0
				staffList[i] = part;//assigns employee
			}
		}

	}
	/**
	 * This method deducts sick days for full time and part time staff
	 */
	public static void fullDeduct() {
		//Initializes fields
		FullTimeStaff full = new FullTimeStaff(50, "Aarsh", "Patel", 100, 0);
		PartTimeStaff part = new PartTimeStaff(50, "Aarsh", "Patel", 100, 0);
		//collects fields from user
		Payroll.typeWritter("Enter the employee number for the staff you would like to select.\n", 15);
		int select = Integer.parseInt(sc.nextLine());
		Payroll.typeWritter("How many days were missed?\n", 15);
		double deduct = Double.parseDouble(sc.nextLine());
		
		for(int i = 0; i < staffList.length; i++)//Iterates through array
		{
			//checks for part time type in work array and employee number
			
			
			if(work[i].equalsIgnoreCase("FT")&&staffList[i].employeeNumber==select) 
			{
				full = (FullTimeStaff) staffList[i];//casts
				full.deductSickDay(deduct);//calls method
				staffList[i] = full;//assigns employees
				Payroll.typeWritter("\nDeducting sick days from full-time staff: \n"+ staffList[i].toString()+"\n", 5);
			}
			
			if(work[i].equalsIgnoreCase("PT")&&staffList[i].employeeNumber==select)  
			{
				part = (PartTimeStaff) staffList[i];//casts
				part.deductSickDay(deduct);//calls methods
				staffList[i] = part;//assigns
				Payroll.typeWritter("\nDeducting sick days from part-time staff: \n"+ staffList[i].toString()+"\n", 5);
			}
			
		}
		
		
		Payroll.typeWritter("Done.", 15);
	}


	/**
	 * This method implements the "type writer" effect
	 */
	public static void typeWritter(String message, int time) 
	{
		for(int i =0; i<message.length();i++)//Iterates through string
		{
			System.out.print(message.charAt(i));//prints out letter from word
			try {
				Thread.sleep(time);//delays message
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
/*
 * This method is used to prompt the user to exit the program
 */
	public static void end() {
		Payroll.typeWritter("\nWould you like to continue? y/n", 10);
		System.out.println();
		//gets answer
		String answer = sc.nextLine();
		//checks for answer
		if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yes")) {
			PayrollRunner.menu = true;
		}
		
		if(answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no")){
			PayrollRunner.menu = false;
			Payroll.typeWritter("Good-by", 150);
		}
	}

}

