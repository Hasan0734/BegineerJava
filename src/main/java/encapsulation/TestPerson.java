/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author jahid
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
      
        p1.setName("Jahid");
        p1.setAge(20);
      
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
