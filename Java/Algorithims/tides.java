import java.util.Scanner;
public class tides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int l = Integer.parseInt(sc.nextLine());
		int array[] = new int[l];
		
		for(int i = 0; i<l;i++){
			array[i] =Integer.parseInt(sc.next());
		}
		int sum = 0;
		for(int i = 0; i<l;i++){
			sum+= array[i];
		
		}
		int average = sum / l;
		
		int[] ht = new int[l];
		int[] lt = new int[l];
		for(int i = 0; i<l;i++){
			if(average>ht[i]){
				ht[i]= array[i];
			}
			else{
				lt[i] = array[i];
			}
		}
	}

}
