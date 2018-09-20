/**
 * This program finds numbers from an array of numbers, by linear search.
 * 
 * Aarsh Patel
 */

import java.util.Scanner;
import java.util.Random;
public class SequentialSearch {

	static Scanner sc = new Scanner(System.in);
	static Random rc = new Random ();
	static int size = 20; //default
	static int list[];
	static boolean menu = true;


	public static void main(String[] args) {
	
		//Questions 1 and 2 are not asked to be called

		//System.out.println("LENGTH OF ARRAY: "+size+" \n");

		//randomFill(1001);
		//print();

		//System.out.println("\nQuestion 1: ");
		//linearSearch();
		//System.out.println("\nQuestion 2: \n");
		//linearSearchTop();

		//System.out.println("Question 3: \n");
		System.out.println("Enter size of array");
		size = Integer.parseInt(sc.nextLine());
		list = new int [size];
		for(int i = 0; i < list.length; i++)
		{
			System.out.print(i+1 +" Enter number:");
			list[i] = Integer.parseInt(sc.nextLine());
		}
		while(menu)
		{
			
			
			System.out.println("Number to find: ");
			int x = Integer.parseInt(sc.nextLine());
			linearSearch2(x);
			print();
		}

		sc.close();
	}


	private static void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
	}

	private static void randomFill(int n) {
		// TODO Auto-generated method stub
		for(int i = 0 ; list.length>i; i++ ){
			list[i] = rc.nextInt(n);
		}
	}

	private static int linearSearch() {
		// TODO Auto-generated method stub
		System.out.println("\nNumber to find: ");
		int x = Integer.parseInt(sc.nextLine());
		for(int i = 0; list.length>i; i++){
			if(x == list[i]){
				System.out.println("Number "+x+" found at index: "+i);
				return i;
			}
		}
		System.out.println("Number not found :(");
		return -1;
	}

	private static int linearSearchTop() {
		// TODO Auto-generated method stub
		System.out.println("Number to find: ");
		int x = Integer.parseInt(sc.nextLine());
		for(int i = list.length-1; i >= 0; i--){
			if(x == list[i]){
				System.out.println("Number "+x+" found at index: "+i);
				return i;
			}
		}
		System.out.println("Number not found :(");
		return -1;	
	}
	private static int linearSearch2(int x) {
		// TODO Auto-generated method stub
		
		if(x == 0) {
			System.out.println("bye");
			menu = false;
		}
		for(int i = 0; list.length>i; i++){
			if(x == list[i]){
				System.out.println("Number "+x+" found at index: "+i);
				if(i !=0 ) {
					int y;
					y = list[i-1] ;
					list[i] = y;
					list[i-1] = x;
					System.out.println("Numbers have been updated.");
					return i;
				}
				if(i == 0){
					System.out.println("Not updated.");
					return 0;
				}
			}
		}
		System.out.println("Number not found :(");
		return -1;
	}
}
