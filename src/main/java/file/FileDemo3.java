package file;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {

    public static void main(String[] args) {

        try {
            File file = new File("/home/jahid/NetBeansProjects/BegineerJava/person/student.tsx");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                
                String id = scanner.next();
                String name = scanner.next();
                
                System.out.println("Name : " + name + ",  " + "ID : " + id + "\n" );
            }
            
            
       
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
