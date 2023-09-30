package basic.begineerjava;

public class DataTypes {

    public static void main(String[] args) {

        boolean b;
        char c;
        short s;
        int i;
        float f;
        double d;

        b = true;
        c = 'a';
        s = 23;
        f = 20.2f;
        i = 100;
        d = 10.5;
//
//        System.out.println("b = " + b);
//        System.out.println("c =" + c);
//        System.out.println("s =" + s);
//        System.out.println("i=" + b);
//        System.out.println("f = " + f);
        
        
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("Character c = %c\n", c);
        System.out.printf("Short s = %d\n", s);
        System.out.printf("Integer i = %d\n",i);
        System.out.printf("Float f = %.2f\n",f);
        System.out.printf("double d = %.3f\n",d);
    }
}
