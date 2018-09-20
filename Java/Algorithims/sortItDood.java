
public class sortItDood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {15,3,39,1,43,10};
sort(arr);
String s = "a";

	}
	
	 private static void sort(int arr[])
	    {
		 int n = arr.length;
	        for (int i = 0; i < n-1; i++){
	            for (int j = 0; j < n-i-1; j++){
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        print(arr);
	        }
	        }
	 
	 private static void print(int[] list) {
		  // TODO Auto-generated method stub
		  for(int i = 0; i < list.length; i++)
		  {
		   System.out.print(list[i]+"\t");
		  }
		  System.out.println();
		 }
}
