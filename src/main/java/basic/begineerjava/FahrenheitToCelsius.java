
package basic.begineerjava;

import java.util.Scanner;


public class FahrenheitToCelsius {
 
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        double farn, cels;
        
        System.out.print("Fahrenheit = ");
        farn = input.nextDouble();
        
        
        
        cels = (farn-32) * 5/9;
        
        System.out.println("Celsius: " + cels);
        
      
    }
}
