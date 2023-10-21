/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static_block;

/**
 *
 * @author jahid
 */
public class StaticBlock {
    
    static int id;
    static String name;
    
    static{
        id = 101;
        name = "Anis";
    }
    
    static void dispaly () {
        System.out.println("id : "+id); 
        System.out.println("Name : "+name); 
    }
    
    
    public static void main(String[] args) {
        StaticBlock.dispaly();
    }
}
