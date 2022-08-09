class Ques2 extends User{

  public static void main(String args[]){
  
  User obj=new User();
  obj.display();
  
  }
   void display(){                             //this program displays override polymorphism in which the name of the functions are same ,
                                               // argument and returntype is same 
   
      System.out.println("hii");
   }

}
class User{

   void display()
 {
     System.out.println("hello");
 
 }


}