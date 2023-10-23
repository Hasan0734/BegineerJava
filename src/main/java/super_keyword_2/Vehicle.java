
package super_keyword_2;

public class Vehicle {
    
    String color;
    double weight;
    
    Vehicle(String c, double w){
        
        color = c;
        weight = w;
    }
    
    
    void attribute(){
        System.out.println("color : " + color);
        System.out.println("weight : " + weight);
    }
}
