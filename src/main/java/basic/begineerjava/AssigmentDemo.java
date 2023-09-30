
package basic.begineerjava;

public class AssigmentDemo {
    
        public static void main(String[] args) {
        
            int x = 7;
            int y = 5;
            
            x+=y ; // x = x + y = 12 (7, 5)
            System.out.println("x = " + x);
            
            x-=y ; // x = x - y = 7 (12,5)
            System.out.println("x = " + x);
            
            x*=y ; // x = x * y = 35 (7, 5)
            System.out.println("x = " + x);
            
            x/=y ; // x = x / y = 7 (35,5)
            System.out.println("x = " + x);
            
            x%=y ; // x = x % y = 2 (7, 5)
            System.out.println("x = " + (double) x);

    }
    
}
