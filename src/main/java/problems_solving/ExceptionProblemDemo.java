package problems_solving;

import java.util.Scanner;

public class ExceptionProblemDemo {

    public static void main(String[] args) {
        int count = 1;
        do {

            try {
                Scanner input = new Scanner(System.in);
                
                System.out.print("Please enter num1 : ");
                int num1 = input.nextInt();
                
                System.out.print("Please enter num2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
                   count = 2;
                
            } catch (Exception error) {
                
                System.out.println("Exception: " + error);
                System.out.println("You must enter integer.please try again");
            }
            
        }while(count == 1);
        
        
        
//        infinite
//        
//        while(true) {
//            try {
//                Scanner input = new Scanner(System.in);
//                
//                System.out.print("Please enter num1 : ");
//                int num1 = input.nextInt();
//                
//                System.out.print("Please enter num2 : ");
//                int num2 = input.nextInt();
//
//                int result = num1 / num2;
//                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
//                
//            } catch (Exception error) {
//                
//                System.out.println("Exception: " + error);
//                System.out.println("You must enter integer.please try again");
//            }
//            
//        }


    } 
}
