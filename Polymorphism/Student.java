
package polymorphism;

public class Student extends Person{

   int ID=1838520119;

     
   @Override
    void print()
    {  
        System.out.println("Age:22");
        System.out.println("Student ID:"+ID);
    }
    
}