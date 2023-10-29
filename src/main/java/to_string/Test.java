
package to_string;


public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Jahid", 20);
        Person p2 = new Person("Nasir", 30);
        
        
        System.out.println(p1); //auto call toString()
        System.out.println(p2); //auto call toString()
    }
}
