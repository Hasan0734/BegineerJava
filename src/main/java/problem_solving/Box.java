
package problem_solving;

public class Box {

    double height, width, depth; //instance variable

    Box(double height, double width, double depth) { //params is local variable
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Volume is : " + vol);
    }
}
