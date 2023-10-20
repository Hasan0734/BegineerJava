
package basic.begineerjava;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListDemo3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(4);
        number.add(2);
        number.add(-1);
        number.add(0);
        
        System.out.println("Before sorting" + number);
        
        
        Collections.sort(number);
        System.out.println("After sorting ascending : "+number);
        
        Collections.reverse(number);
        
        System.out.println("After sorting dscending : " + number);
    }
}
