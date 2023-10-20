package basic.begineerjava;

public class StringDemo1 {

    public static void main(String[] args) {

        String s1 = "Jahid Hasan";
        String s2 = new String("Jahid Hasan");

//        char[] s3 = {'a', 'b', 'c', 'd'};
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
//        System.out.println("s3 = " + s3);

        int len = s1.length();
        System.out.println("Length of s1 = " + len);
        
        //equals, contains, equalsIgnoreCase
        
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
        
        boolean con = s1.contains("Hasan");
        
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("b = " + b);
        
    }
}
