class Rectangle{
	static int l = 7;
	int b= 6;
	

   static void area(){
	    
    
	{   
       	System.out.println("area "); 
		
    }
  
   void circumference(){
	 
	  {
         System.out.println("circumference");
		 
	  }
  }
  

}
}
class Shape extends Rectangle{
 public static void main(String args[]){
    Shape obj = new Shape();
	obj.circumference();
	Shape.area();
	
  
 
 }
 
 
}