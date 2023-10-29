/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to_string;

/**
 *
 * @author jahid
 */
public class Person {
    String name;
    int age;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name : " + name + "\n" + "Age : " + age;
    }
}
