
package inheritance;


public class Teacher extends Person {
    
    String qualification;
    void displayInformation2(){
        dispalyInformation1();
        System.out.println("Qualification : " + qualification);
    }
}
