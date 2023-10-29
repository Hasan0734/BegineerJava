
package linked_list;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        
        //student likedlist
        LinkedList<Student> list = new LinkedList<Student>();
        
        //student create 
        
        Student s1 = new Student("Jahid", "Ten", 101);
        Student s2 = new Student("Nasir", "Ten", 102);
        Student s3 = new Student("Rasel", "Ten", 102);
        Student s4 = new Student("Hasan", "Ten", 102);
       
        
        //adding student to t he studentlist
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        
        for(Student s : list){
            System.out.println(s.id + "  " + s.name + "  " + s.className );
        }
      
    }
}
