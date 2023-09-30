
package basic.begineerjava;

import java.util.Scanner;


public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n, sum=0;
        
        System.out.print("Enter the last number: ");
        n = input.nextInt();
        
        for (double i = 1.5; i <= n; i = i + 1) {
             System.out.println(i+ " ");
            sum = sum + i;
        }
        
        System.out.println("sum is : " + sum);
    }
    
}
