
package basic.begineerjava;

public class StringDemo2 {
    public static void main(String[] args) {
        
        String firstName = "Jahid";
        String lastName = " Hasan";
       
        String fullName = firstName + lastName;
        String fullname2 = firstName.concat(lastName);
        
        System.out.println(fullname2);
        
        String upperName = fullname2.toUpperCase();
        System.out.println(upperName);
        
        String lowerName = fullname2.toLowerCase();
        System.out.println(lowerName);
        
        boolean b = firstName.startsWith("J");
        System.out.println(b);
        
        boolean e = firstName.endsWith("d");
        System.out.println(e);
        
        String[] names = {"Jahid", "Hasan", "Rasel", "Nasir", "Monir"};
        
        for(String x: names){
            System.out.println(x.toUpperCase());
        }
    }
}
