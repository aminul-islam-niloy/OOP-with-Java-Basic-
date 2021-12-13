
package Overriding;

public class Student extends Person{
    String result;
    String University;
    
    @Override
    void print()
    {
        System.out.println("Student's Information: ");
         System.out.println("Name: "+name);
        System.out.println("Age: "+age);
         System.out.println("Result: "+result);
        System.out.println("College name: "+college);
        System.out.println("University name: "+University);
    }
}