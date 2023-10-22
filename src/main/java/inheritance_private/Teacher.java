
package inheritance_private;

import inheritance.*;


public class Teacher extends Person {
    
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public void displayInformation2(){
       
        System.out.println("Qualification : " + qualification);
    }
}
