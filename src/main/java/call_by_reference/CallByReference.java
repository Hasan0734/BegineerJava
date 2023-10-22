/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package call_by_reference;

/**
 *
 * @author jahid
 */
public class CallByReference {
    
    String name;
    void change(CallByReference r2){
        r2.name = "Hasan";
    }
}
