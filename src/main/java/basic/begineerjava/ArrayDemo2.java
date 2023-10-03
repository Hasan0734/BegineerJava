package basic.begineerjava;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.print("Please enter 5 numbers : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];
        }

        double avg = sum / number.length;
        System.out.println("Average is : " + avg);

        System.out.println("The sum is : " + sum);
        
        //maximum number of array

        double max = number[0];
        
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }

        System.out.println("Array maximum number is : " + max);
        

        //minimum number of array
        
        double min = number[0];
        
        for (int i = 1; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }

        System.out.println("Array min number is : " + min);

    }
}
