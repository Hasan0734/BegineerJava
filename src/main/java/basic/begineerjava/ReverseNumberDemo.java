package basic.begineerjava;

import java.util.Scanner;

public class ReverseNumberDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, num, temp, r;

        System.out.print(" Enter your digits : ");
        num = input.nextInt();

        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        
        System.out.println("Your reverse number is : " + sum);
    }

}
