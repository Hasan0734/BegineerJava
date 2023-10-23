
package method_overriding;


public class Teacher extends Person{
        
    String qualification;
    
    @Override
            
    void displayInformation(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("qualification : "+qualification);
    }
}
