//Ques: 8
class Fam{
public static void main(String[] args){
int rows= 3;
int columns= 5;
for(int i= 1;i<=rows;i++)
{
   for(int j= 1;j<=columns;j++)
   {
   
   if((i+j)%2==0)
   {
   System.out.print("1");
   }
   else
   {
   
   System.out.print("0");   
   }


}
System.out.println();


}



}
}
//Ques : 5
//Pass by value: In this we pass a variable as a function argument. The variable passed is not the original variable but the copy of that variable.
// changes in the copy does not affect the original value of the variable.
// Syntax :       int a= 7;
//                above variable is passed as argument [public static void main(int a)]

//Pass by reference : In this we pass the original variable as the function argument , change in the function changes the value of the variable.
// By Default , JAVA is pass by value always as even if values change then too in the backend the copy of the id is passed as reference to the 
//function.