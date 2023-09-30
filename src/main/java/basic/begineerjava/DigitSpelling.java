/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.begineerjava;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class DigitSpelling {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int digit;
        
        System.out.print("Enter any digit: ");
        digit = input.nextInt();
        
        switch(digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");  
                  break;
             case 2:
                System.out.println("Two");
                  break;
            case 3:
                System.out.println("Three");
                  break;
             case 4:
                System.out.println("Four");
                  break;
            case 5:
                System.out.println("Five");      
                  break;
             case 6:
                System.out.println("Six");
                  break;
            case 7:
                System.out.println("Seven");   
                  break;
             case 8:
                System.out.println("Eight");
                  break;
            case 9:
                System.out.println("Nine");  
                  break;
            default:
                System.out.print("Invalid Degit");
        }
        
    }
}
