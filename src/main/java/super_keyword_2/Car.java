package super_keyword_2;

public class Car extends Vehicle {
    //color, weight,attribute()

    int gear;

    Car(String c, double w, int g) {
        super(c, w); //callig the constructor of vehicle class
        gear = g;
    }

    @Override
    void attribute() {
       super.attribute();
        System.out.println("gear : " + gear);
    }

}
