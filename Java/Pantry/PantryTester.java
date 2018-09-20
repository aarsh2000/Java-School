
/**
 * @author aarsh patel
 * 
 * This program allows an user to pick a jam from
 * Mother Hubbard's pantry. Choose from 3 jams!
 * 
 *
 */

import java.util.Scanner;

public class PantryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Greets user
		System.out.println("Welcome to Mother Hubbard's pantry\n");
		Scanner sc = new Scanner (System.in);

		//Asks input for jam one
		System.out.println("Enter name, date, and size of jam one: ");
		System.out.println("Jam #1 content: ");
		String s = sc.nextLine();
		System.out.println("Jam #2 date: ");
		String d = sc.nextLine();
		System.out.println("Jam #3 size: ");
		double c = Double.parseDouble(sc.nextLine());
		Jam one = new Jam (s, d, c);

		//Asks input for jam two
		System.out.println("\nEnter name, date, and size of jam two: ");
		System.out.println("Jam #2 content: ");
		String s2 = sc.nextLine();
		System.out.println("Jam #2 date: ");
		String d2 = sc.nextLine();
		System.out.println("Jam #2 size: ");
		double c2 = Double.parseDouble(sc.nextLine());
		Jam two = new Jam (s2, d2, c2);

		//Asks info for jam three
		System.out.println("\nEnter name, date, and size of jam three: ");
		System.out.println("Jam #3 content: ");
		String s3 = sc.nextLine();
		System.out.println("Jam #3 date: ");
		String d3 = sc.nextLine();
		System.out.println("Jam #3 size: ");
		double c3 = Double.parseDouble(sc.nextLine());
		Jam three = new Jam (s3, d3, c3);

		//creates a pantry with the jams
		Pantry Hubbard = new Pantry(one, two, three);


		//allows menu to run more than once, returns true if user has terminated
		boolean term = false;
		//loops through menu
		while(term==false) { 
			System.out.println(Hubbard.toStr());
			System.out.println("Enter you selection (1, 2, or 3):");

			//gets user selection of jam
			int user = sc.nextInt();
			//terminates the program if invalid input
			if(user==-1) {
				term = true;
				System.out.println("Good-by");
			}

			//if program is not terminated than continues with the spreading part
			else {
				switch(user) {

				//selection one
				case 1:

					System.out.println("\nEnter amount of spread: ");
					double rm = sc.nextDouble();
					Hubbard.spread(one, rm);//spreads jam one

					break;
					//selection two
				case 2:

					System.out.println("Enter amount of spread: ");
					double rm2 = sc.nextDouble();
					Hubbard.spread(two, rm2);//spreads jam two

					break;
					//selection three
				case 3:

					System.out.println("Enter amount of spread: ");
					double rm3 = sc.nextDouble();
					Hubbard.spread(three, rm3);//spreads jam three

					break;

				default:
					System.out.println("Retry.");//for any invalid input
				}
			}

		}
		sc.close();  //closes inputs for leaks
	}
}