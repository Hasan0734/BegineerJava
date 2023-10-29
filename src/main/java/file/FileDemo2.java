package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {

        String id, name;

        try {
            Formatter formatter = new Formatter("/home/jahid/NetBeansProjects/BegineerJava/person/student.tsx");

            Scanner input = new Scanner(System.in);

            System.out.println("How many students : ");

            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println("Enter student id and name : ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\n", id, name);
            }
//            
//            formatter.format("%s %s\n", "101", "Jahid");
//            formatter.format("%s %s\n", "102", "Hasan");
//            formatter.format("%s %s\n", "103", "Rasel");
//            formatter.format("%s %s\n", "104", "Nasir");
//            formatter.format("%s %s\n", "105", "Karim");
            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
