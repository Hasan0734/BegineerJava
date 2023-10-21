
package basic.begineerjava;


public class StringDemo7 {
    
    
    public static void main(String[] args) {
        
        double i = 100.25;
        String s = Double.toString(i);
        System.out.println("s = " +s);
        
        
        boolean b = true;
        String c = Boolean.toString(b);
        System.out.println("c = " + c);
        
        String d = "32";
        int f = Integer.parseInt(d);
        System.out.println("f = " + f);
        
        int e = Integer.valueOf(d);
        System.out.println("e = "+ e);
        
    }
}
