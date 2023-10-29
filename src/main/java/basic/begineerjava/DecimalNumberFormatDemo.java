
package basic.begineerjava;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        
        DecimalFormat ob = new DecimalFormat("0.00");
        
        double x = 2.90454545;
//        System.out.printf("x = %.2f",x);
        System.out.println("x = "+ ob.format(x));
    }
}
