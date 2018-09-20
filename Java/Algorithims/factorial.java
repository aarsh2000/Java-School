
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(5));
long pro = 1;
for(long i= 0; 120>i; i++){
	pro= pro* i;
}
System.out.println(pro);
	}
	
	public static long factorial(int n){
		if (n==1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	
	

}
