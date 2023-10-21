package basic.begineerjava;

public class WrapperDemo {

    public static void main(String[] args) {
        //primitive -> object
        int x = 30;

        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        Integer z = x; //Integer.valueOf(x)  autoboxing
        System.out.println("z = " + z);
        
        
        //object -> primitive
        
        Double d = new Double(10.25);
        
        System.out.println("d = " + d);
        
        double e = d.doubleValue();
        System.out.println("e = "+ e);
        
        double f = d; //d.doubleValue()  unboxing
        System.out.println("f = "+ f);
    }
}
