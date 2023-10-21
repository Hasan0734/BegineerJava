/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static_keyword;

/**
 *
 * @author jahid
 */
public class Student {

    String name;
    int id;
    static String universityName = "Ananda Mohan College";

    Student(String n, int i) {
        name = n;
        id = i;
    }
    
    void displayInformation(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("University : " + universityName +"\n");
    }
}
