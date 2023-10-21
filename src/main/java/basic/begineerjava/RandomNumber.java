package basic.begineerjava;

import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(2) + 1; //normally 0 to 9
        System.out.println("random number = " + randomNumber);
        
        int random = (int) (Math.random() * 2) + 1;
        System.out.println("randomm number = " + random);
    }
}
