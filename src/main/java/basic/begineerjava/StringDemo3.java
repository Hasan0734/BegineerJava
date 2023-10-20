
package basic.begineerjava;

public class StringDemo3 {
    public static void main(String[] args) {
        
        String country = " Bangladesh is  my  country  ";
        System.out.println(country);
        
        String s3 = country.trim();
        System.out.println(s3);
        
        char ch = country.charAt(0); //return character by index
        System.out.println("ch " + ch);
        
        int value = country.codePointAt(0); //ASCII value
        System.out.println("Value = " +value);
        
        int pos = country.indexOf('n'); // find first index 
        System.out.println("First position of n = "+pos );
        
        pos = country.lastIndexOf('n'); //last index find
        System.out.println("Last position of n = "+pos);
    }
}
