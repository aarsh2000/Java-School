/**
 * FINAL COPY
 * This program sorts numbers (bubble sort method)
 * Aarsh Patel
 */
import java.util.Scanner;
import java.util.Random;
public class sort_methods{
 static Scanner sc = new Scanner(System.in);
 static Random rc = new Random ();
 static int size = 20; //default
  
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int list[] = new int [size];
  randomFill(1001 ,list);
  print(list);
  System.out.println("*******************************Sorting....*****************************");
  //sort_method1(list);
  sort_method2(list);
  print(list);
  sc.close();
 }
 private static void randomFill(int n, int[] list) {
  // TODO Auto-generated method stub
  for(int i = 0 ; list.length>i; i++ ){
   list[i] = rc.nextInt(n);
  }
 }
 private static void print(int[] list) {
  // TODO Auto-generated method stub
  for(int i = 0; i < list.length; i++)
  {
   System.out.println(list[i]);
  }
 }
 private static void sort_method1(int[] list) {
  // TODO Auto-generated method stub
   int index = 0;
   for(int j = 0; j < list.length; j++){
   for(int i =0; i< list.length; i++){
 
      if( i != list.length-1 && list[i]>list[i+1] ){
       int one = list[i];
       int two = list[i+1];
       list[i]=two;
       list[i+1]=one;   
       }
     }
   }

 }
 
 private static void sort_method2(int[] list){
  
  for(int i = 0; list.length > i; i++){ 
   for(int j = i; list.length > j; j++){
    if(list[j] <= list[i]){
     int one = list[i];
        int two = list[j];
        list[i]=two;
        list[j]=one;
    }
   }
  }
 
 
}
}

