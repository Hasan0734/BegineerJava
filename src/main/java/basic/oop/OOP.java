package basic.oop;

public class OOP {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Jahid Hasan", "Male", 1724445454);
        Teacher teacher2 = new Teacher("Hasan", "Male", 554545545);
        Teacher teacher3 = new Teacher();
//
//        teacher1.name = "Jahid hasan";
//        teacher1.gender = "Male";
//        teacher1.phone = 175454454;
//        
//        teacher2.name = "Rasel Ahmed";
//        teacher2.gender = "Male";
//        teacher2.phone = 175454454;
//
//        System.out.println("Name : " + teacher1.name);
//        System.out.println("Gender : " + teacher1.gender);
//        System.out.println("Phone : " + teacher1.phone);

//        teacher1.setInformation("Jahid Hasan", "Male", 1724445454);
//        teacher2.setInformation("Hasan", "Male", 554545545);

        teacher1.displayInformation();
        teacher2.displayInformation();
    }

}
