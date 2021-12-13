
package pkgprivate;

public class Teacher extends Person {
    private String qualification;
    int accountNo;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

   void displayinformation(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
   }
   
    @Override
   void print(){
         System.out.println("Phone number = "+number);
         System.out.println("Account Number ="+accountNo);
   }
}
