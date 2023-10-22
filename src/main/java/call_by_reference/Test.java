/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package call_by_reference;

/**
 *
 * @author jahid
 */
public class Test {
    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
            
        r1.name = "Jahid";
        System.out.println("Before calling : " + r1.name);
        r1.change(r1);
        System.out.println("After calling : " + r1.name);
    }
}
