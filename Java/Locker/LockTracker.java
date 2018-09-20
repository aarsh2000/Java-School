import java.util.Scanner;
public class LockTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Key lock #1 ");
		int a = sc.nextInt();
		Lock one = new Lock(a);
		while(String.valueOf(a).length()!=6){
			System.out.print("Enter Key lock #1 ");
			a = sc.nextInt();
			one = new Lock(a);
		}
		
		System.out.print("Enter Key lock #2 ");
		int b = sc.nextInt();
		Lock two = new Lock(b);
		while(String.valueOf(b).length()!=6){
			System.out.print("Enter Key lock #2 ");
			b = sc.nextInt();			
			one = new Lock(b);
		}
		

		
		boolean con =true;
		while(con==true) {
	    System.out.println("Enter which lock you want to CLOSE, to exit press any other key");
	    int x = sc.nextInt();
		
		switch(x){
		case 1: one.close();
		
	
		break;

		case 2:two.close();
		
		break;

		default:con=false;


		}
		}
		
		
		int fail = 0;
		boolean o=false;
		boolean o2=false;
		boolean con2 =true;
		while(con2==true) {
	    System.out.println("**Enter which lock you want to OPEN, to exit press any other key");
	    int x = sc.nextInt();
		
		int key;
		switch(x){
		
		case 1:
			System.out.println("Enter key for lock 1");
			key=sc.nextInt();
			if(key==123456){
				o=true;
				
				System.out.println("Lock 1 opened");
			}
			else{
			if(fail>=2){
				System.out.println("Max # of fails, RESET with universal key");
			}
			else{
			if(one.open(key)==true){;
			System.out.println("Lock 1 opened");
			o=true;
			}
			else{
				System.out.println("Lock 1 not opened");
				fail++;
			}
			}
			}
		break;

		case 2:
			
			System.out.println("Enter key for lock 2");
			key=sc.nextInt();
			if(key==123456){
				o2=true;
				System.out.println("Lock 2 opened");
			}
			else{
			
			if(fail>=2){
				System.out.println("Max # of fails, RESET with universal key");
			}
			else{
				if(two.open(key)==true){;
				System.out.println("Lock 2 is opened");
				o2=true;
				}
				else{
				System.out.println("Lock 2 not opened");
				fail++;
				}
			}
			}
		break;

		default:con2=false;


		}
		}
		
		if(one.equals(two)==true){
			System.out.println("\nThe locks have the same key\n");
		}
		else{ System.out.println("\nThe locks do not have the same key\n");

		}
        if(o==true){
        	System.out.println("Lock one is open");
        }
        else{
        	System.out.println("Lock one is "+ one.toString());
        }
        if(o2==true){
        	System.out.println("Lock two is open");
        }
        else{
        	System.out.println("Lock two is "+ two.toString());
        }
        
		
		if(one.isOpen()==false&&two.isOpen()==true) {
			System.out.println("1 lock is closed");
		}
		if(one.isOpen()==true&&two.isOpen()==false) {
			System.out.println("1 lock is closed");
		}
		if(one.isOpen()==false&&two.isOpen()==false) {
			System.out.println("2 locks are closed");
		}
		sc.close();
	}
	
}
