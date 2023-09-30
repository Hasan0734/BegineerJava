
package basic.begineerjava;
import java.util.Scanner;


public class InputDemo {
    
    public static void main(String[] args) {
        
        
     Scanner input = new Scanner(System.in);
   /**        int number;
       
        System.out.println("Enter any number: ");
        number = input.nextInt();
        
        System.out.println("Number = "+ number);
        
        **/
        
        String name;
        
        System.out.println("Enter your name: ");
        name = input.nextLine();
        
        System.out.println("Name is: "+ name);
    }
    
    
}
