/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method_overloading;

/**
 *
 * @author jahid
 */
public class Test {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        ob.add(5,6);
        ob.add(5.5, 6.5);
        ob.add(1, 2, 3);
    }
}
