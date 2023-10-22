
package inheritance_private;

import inheritance.*;


public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Jahid");
        t1.setAge(20);
        t1.setQualification("BSC");
      
        System.out.println("Name : " + t1.getName());
        System.out.println("Age : " + t1.getAge());
        System.out.println("Qualification : " + t1.getQualification());
    }
}
