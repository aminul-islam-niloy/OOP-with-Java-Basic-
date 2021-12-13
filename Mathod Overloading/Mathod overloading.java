1.	package overloading2;
class DispOvrload
{
    public void show(char ch)
    {
         System.out.println ("Display: "+ch);
    }
    public void show(char ch, char ch1)  
    {
         System.out.println("Display: "+ch+", and " + ch1);
    }
}


package overloading2;
public class main {
    
   public static void main (String args[] )
   {
       DispOvrload o1 = new DispOvrload();
       o1.show('G');
       o1.show( 'S', 'J' );
   }
}