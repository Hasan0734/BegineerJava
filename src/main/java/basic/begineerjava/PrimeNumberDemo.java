package basic.begineerjava;

import java.util.Scanner;

public class PrimeNumberDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter any positive integer : ");

        num = input.nextInt();
        int count = 0;

        if (num == 0 || num == 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

    }
}
