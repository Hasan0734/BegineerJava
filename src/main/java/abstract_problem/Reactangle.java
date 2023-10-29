package abstract_problem;

public class Reactangle extends Shape {
        //dim1, dim2
    
    
    Reactangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    
    
    @Override
    void area(){
        double result = dim1 * dim2;
        System.out.println("Reactangle area : " + result);
    }
}
