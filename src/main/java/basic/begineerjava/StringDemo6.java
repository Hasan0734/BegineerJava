
package basic.begineerjava;

public class StringDemo6 {
    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Jahid");
        
        System.out.println("Str = " + str);
        
        str.append(" Hasan");
        str.append(25);
        str.append(12.5);
        
        System.out.println("str = " + str);
        
        
    }
}
