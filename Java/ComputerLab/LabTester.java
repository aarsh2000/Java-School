import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LabTester {
	public static int size,made,pur,ram,exp;
	public static String sNum,manu;	
	public static double speed;
	
	
	static Lab one = new Lab();
	
	public static void main(String []args){
		
	Scanner sc = new Scanner (System.in);
	
	readFile("computer.txt");
	String find = null;
	
	//String exp = "";
	int sum =0;
	int sum2 = 0;
	int sum3 = 0;
	double sum4 = 0;
	int counter = 0;
	String a = "";
	Computer newest = new Computer();
	Computer Ram = new Computer();
	Computer Speed = new Computer();
	for(int i = 0; size>i;i++) {
		Computer x = new Computer();
		x = Lab.computers[i];
		
		//Output average age of the computers in the lab
		sum = sum + x.getMade();
		
		//Output the spec of the newest computer
		if(x.compareAge(sum2))
		{	
			newest = x;
		}	
		sum2 = sum2+x.getMade();
		
		
		//Output the spec of the faster computer (highest speed), and indicate if it has the largest size of RAM
		
		if(x.compareRam(sum3))
		{	
			Ram = x;
		}	
		sum3 = sum3+x.getRam();
		
		if(x.compareSpeed(sum4))
		{	
			Speed = x;
		}	
		sum4 = sum4+x.getProSpeed();
	
		
		
		
	}
	System.out.println("The average age is "+ sum/size);
	System.out.println("\nThe newest computer is \n"+newest.toString());
	System.out.println("\nComputer with the fastest proccessor is \n"+Ram.toString());
	if(Ram == Speed) {
		System.out.println("\nThis computer also with largest ram. \n");
	}
	
	
	System.out.println("\nSearch manufacturer: ");
	find = sc.nextLine();
	for(int i = 0; size>i;i++) {
		Computer x = new Computer();
		x = Lab.computers[i];
		//Ask user for a particular manufacturer, and output the number of computers with the manufacturer.
				
				if(find.equalsIgnoreCase(x.getManu())) {
					counter++;
					
				}
				
				
				
				//Output the serial number of all the computers that are expiring in the next year.
				if(x.getExpire()==2018){
					a += ("\nExpiring serial num: "+x.getSerialNum());
				}
	}
	
	
	
	
	System.out.println("\nThere are " +counter+" computers with the manufacturer name, "+find);
	System.out.println("\nExpiring serial numbers for 2018 are, "+a);
	
	sc.close();
	}
	
	public static void readFile(String fn) {//start of readFile method
		Scanner s = null;
		int n =0;
		try {
			s = new Scanner((Readable) new BufferedReader(new FileReader(fn))); //finds file name
			size = Integer.parseInt(s.nextLine());  
			while(n<size) {			
			sNum = s.nextLine();
			manu = s.nextLine();
			made = Integer.parseInt(s.nextLine()); 
			pur = Integer.parseInt(s.nextLine()); 
			speed = Double.parseDouble(s.nextLine());
			ram = Integer.parseInt(s.nextLine());
			exp = Integer.parseInt(s.nextLine()); 
			Lab.installComputer(sNum, manu,made,pur,speed,ram,exp);
			n++;
			}
			//finds .txt file
		} catch( FileNotFoundException e){
			System.out.println("File was not found!");
		} finally {
			if (s!=null){
				s.close();
			}
		 
		 
		}

	}//end of read file method
 

}


