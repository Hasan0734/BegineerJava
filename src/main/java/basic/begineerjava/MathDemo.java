/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.begineerjava;

/**
 *
 * @author jahid
 */
public class MathDemo {
    
    
    public static void main(String[] args) {
        
        int x = 2;
        int y = 3;
        
        int min = Math.min(x, y);
        
        System.out.println("Minimum number is = " + min);
        
        int max = Math.max(x, y);
        System.out.println("Maximum number is = "+ max);
        
        int absolute = Math.abs(y);
        System.out.println("Absoulte of y = "+ y); //when negative
        
        double power = Math.pow(x, y);
        System.out.println("x to the power y = "+ power);
        
        int round = Math.round(8.5f);
        System.out.println("Round of 8.8 = "+round);
        
        double pi = Math.PI;
        System.out.println("pi = "+pi);
    }
}
