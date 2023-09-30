
package basic.begineerjava;

public class IncrementDecrement {
    
    public static void main(String[] args) {
        
        int x = 25;
        int y;
        
        //increment++
        y = x++; //post increment
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+ y);
        
        y = ++x; //prefix increment
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        
        //decrement
        
        y = x--; //post decrement
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+ y);
        
        y = --x; //prefix decrement
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
        
        
    }
}
