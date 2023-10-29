
package file;

import java.io.File;


public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("person");
       
        
        dir.mkdir(); //directory will be created
                
        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        
        File file1 = new File(dirLocation +"/student.txt");
        File file2 = new File(dirLocation +"/Teacher.txt");
        
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        }catch(Exception e){
            System.out.println(e);
        }
        
        if(file1.exists()){
            System.out.println("File exists");
        }

        
        
       
        
//        
//        System.out.println(dir.getName());
//        
//        if(dir.delete()){ 
//            System.out.println(dir.getName() + " Folder has been deleted");
//        }
        
    }
}
