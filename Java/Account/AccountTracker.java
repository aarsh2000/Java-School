import java.util.Scanner;
public class AccountTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter information for check ammout #1");
		int a = sc.nextInt();
		String b = sc.nextLine();
		double c = sc.nextDouble();
		
		CheckingAccount one = new CheckingAccount(a,b,c);
		
		one.toString();

	}

}
