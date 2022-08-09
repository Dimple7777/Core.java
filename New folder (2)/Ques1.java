
import java.util.Scanner;
class Ques1 extends Rate{
 public static void main(String args[]){
	 
	Scanner read= new Scanner(System.in);
	System.out.println("enter password = ");
	int password = read.nextInt();
	
    Rate obj = new Rate();
  
   System.out.println("new password = " +obj.get(password));
   System.out.println(" password = " +obj.set(password,6));
   System.out.println("after updation password = " +obj.get(password));
 }



}
class Rate{

 private int password= 7;
 int newpassword=6;
 
 int get(int password){
   if(checkpassword(password)){
    return newpassword;
   
   }
   return 0;
 }
   
   int set(int password, int newpassword){
	   if(checkpassword(password)){
   
   return this.password=password;
   }
   return newpassword;
   }
   boolean checkpassword( int password){
   
    return this.password==password;
   }
 }

