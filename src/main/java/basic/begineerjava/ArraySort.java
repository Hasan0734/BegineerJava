/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.begineerjava;

import java.util.Arrays;

/**
 *
 * @author jahid
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] numbers = {10, -3, 18, 5, 15};

        Arrays.sort(numbers);

        System.out.println("Aescending ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();

        System.out.println("Descending ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }

        System.out.println("");

        String[] names = {"Jahid", "Hasan", "Naiam", "Nasir", "Rasel"};

        Arrays.sort(names);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("");
        
        // reverse sort
        
        for (int i = 4; i >= 0; i++) {
             System.out.println(names[i]);
        }
       
    }
}
