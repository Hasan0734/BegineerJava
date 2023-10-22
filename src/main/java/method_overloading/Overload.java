/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method_overloading;

/**
 *
 * @author jahid
 */
public class Overload {

//    void add(int a, int b) {
//        System.out.println(a + b);
//    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add() {
        System.out.println("Nothing to add");
    }
}
