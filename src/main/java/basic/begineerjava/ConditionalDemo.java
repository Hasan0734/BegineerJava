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
public class ConditionalDemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter 2 numbers : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        large = (num1 > num2) ? num1 : num2;
        
        System.out.println("Large number = "+ large);
        
    }
}
