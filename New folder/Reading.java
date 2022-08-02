//Ques: 7
import java.util.Scanner;
class Reading{

 public static void main(String args[]){
 
 Scanner read = new Scanner(System.in);
 
	 System.out.println("enter no. the value");
	 
	 
 
 int n= read.nextInt();
 int arr[] = new int[n];
 System.out.println("enter the values");
 
 
   for(int i= 0; i<=9;i++)
   {
   arr[i]= read.nextInt();
   
   }
  for(int i: arr){
  System.out.println(i);
  }
 }
}