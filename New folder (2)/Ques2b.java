class Ques2b extends User{

  public static void main(String args[]){
  
  User obj=new User();
  obj.display(3);
  
  }
   void display(){                             //this program displays overload polymorphism in which the name of the functions are same ,
                                               // but argument or returntype is not same.
   
      System.out.println("hii");
   }

}
class User{

   void display(int a)                   //argument is passed in the function 
 {
     System.out.println("hello"  +a);
 
 }


}