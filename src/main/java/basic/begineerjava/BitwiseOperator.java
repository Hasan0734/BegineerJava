/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.begineerjava;

/**
 *
 * @author jahid
 */
public class BitwiseOperator {
    
    public static void main(String[] args) {
        
        int a = 32;
        int b = 12;
        int c;
        
        c = a & b;
        System.out.println("a + b = "+ c );
        
        c = a | b;
        
        System.out.println("a ! b = "+ c );
        
        c = a^b;
        System.out.println("a ^ b = " + c);
        
        c = a >> 3;
        System.out.println("a>>3 = " + c);
        
        c = a << 3;
        System.out.println("a << 3 = " + c);
    }
    
}
