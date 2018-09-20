
public class Lab {
	public static final int MAX_CAP = 30;
	private static int numComp = 0;
	public static Computer computers[];
	
	public Lab(){
		
		computers = new Computer [MAX_CAP];
	}
	
	public static int installComputer(String serialNum,String manu,int purchase, int made,double proSpeed,int ram,int expire){
		if(numComp<MAX_CAP){
		computers[numComp] = new Computer(serialNum, manu, purchase, made, proSpeed, ram, expire );
		
		numComp++;
		}
		return 0;
	}
	
	public Computer newestComputer(){
		int year = -1 ;
		int index = 0; 
		
		for(int i=0 ; i< computers.length; i++){
			if(computers[i].getMade()>year){
				year = computers[i].getMade();
				index = i;
			}
			
		
		}
		if(year>-1){
			return computers[index];
		}
		else{
			return null;
		}
		
			
		
	}
	
	
	
	
}
