
package Overriding;


public class Person {
     String name;
    int age;
    String college = "Imperial College";
    
    void display( String n, int a)
    {
        n= name;
        a= age;
        
    }
    
    void print()
    {
        System.out.println("College name: "+college);
    }

    
    
}
