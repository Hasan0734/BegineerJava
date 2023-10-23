package method_overriding;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();

        p.name = "Jahid";
        p.age = 20;

        p.displayInformation();
        System.out.println("");

        t.name = "Hasan";
        t.age = 21;
        
        t.qualification = "BSC";
        t.displayInformation();
    }

}
