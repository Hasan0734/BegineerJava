/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package call_value;

/**
 *
 * @author jahid
 */
public class Test {
    public static void main(String[] args) {
        CallValue ob = new CallValue();
        int x = 10;
        System.out.println("x before call : "+ x);
        
        ob.change(x);
        System.out.println("x after call : " +x);
    }
}
