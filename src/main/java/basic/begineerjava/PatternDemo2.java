package basic.begineerjava;

import java.util.Scanner;

/**
 *
 * @author jahid
 */
public class PatternDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter line numbers : ");

        int num = input.nextInt();

        for (int row = num; row >= 1; row--) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

}
