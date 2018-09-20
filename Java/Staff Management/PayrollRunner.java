import java.util.Scanner;
public class PayrollRunner {
	//intializes scanner 
	static Scanner sc = new Scanner(System.in);
	//for menu
	static boolean menu = true;
	public static void main (String []args){
		// TODO Auto-generated constructor stub
		Payroll.typeWritter("Welcome\n", 50);
		do {
			//runs atleast one
			//prints out all options

			Payroll.typeWritter("\nSelect from the following options:", 0);
			Payroll.typeWritter("\n0. Exit", 0);
			Payroll.typeWritter("\n1. List all employees", 0);
			Payroll.typeWritter("\n2. Enter Sick day(s) (full-time or part-time)", 0);
			Payroll.typeWritter("\n3. Print all pay stubs", 0);
			Payroll.typeWritter("\n4. Reset yearly sick day (full-time)", 0);
			Payroll.typeWritter("\n5. Reset monthly sick day (part-time)", 0);
			Payroll.typeWritter("\n6. Load staff list from exsisting text file", 0);
			Payroll.typeWritter("\n7. Save staff list to text file", 0);
			Payroll.typeWritter("\n8. Average salary for full-time staff", 0);
			Payroll.typeWritter("\n9. Average hourly salary for part-time staff", 0);
			Payroll.typeWritter("\n10.Print full-time staff who has taken the most sick day in the current year", 0);
			Payroll.typeWritter("\n11.Print part-time staff who has taken the most sick day in the current month", 0);
			System.out.print("\n>");
			//gets users selection
			int user = Integer.parseInt(sc.nextLine());

			switch(user) //checks for user (selection)
			{
			//for each case selection 
			case 0:
				Payroll.typeWritter("Good-by", 150);
				menu =false;
				break;
			case 1:
				Payroll.listAllEmployee();

				break;
			case 2:
				Payroll.fullDeduct();

				break;
			case 3:
				Payroll.printAllPayStub();

				break;
			case 4:
				Payroll.yearlySickDayReset();

				break;
			case 5:
				Payroll.monthlySickDayReset();

				break;
			case 6:
				Payroll.typeWritter("\nEnter file name (please add .txt at end)\n", 10);
				String fn = sc.nextLine();	
				Payroll.loadStaffList(fn);

				break;
			case 7:
				Payroll.typeWritter("\nEnter the name of the file you would like to save to (please add .txt at end)\n", 10);
				String sn = sc.nextLine();	
				Payroll.saveStaffList(sn);

				break;
			case 8:
				System.out.println("\nThe average salary is "+Payroll.averageSalary());

				break;
			case 9:
				System.out.println("\nThe average hourly rate is "+Payroll.averageHourlyRate());

				break;
			case 10:
				System.out.println(Payroll.mostAbsentFullTime());

				break;
			case 11:

				System.out.println(Payroll.mostAbsentPartTime());

				break;


			default:
				Payroll.typeWritter("Retry.\n",150);//for any invalid input
			}


		}while(menu);



	}

}