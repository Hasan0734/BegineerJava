
package varargs;


public class Test {
    public static void main(String[] args) {
        AddDemo ob = new AddDemo();
        ob.add(10,20);
        ob.add(20,30,10);
        ob.add(10, 20, 40, 10);
        
        
    }
}