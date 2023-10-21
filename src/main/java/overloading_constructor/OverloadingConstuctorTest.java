/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_constructor;

/**
 *
 * @author jahid
 */
public class OverloadingConstuctorTest {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Jahid", "Male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("Jahid Hasan", "Male", 154544455);
        teacher3.displayInformation();
    }
}
