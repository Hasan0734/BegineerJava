
package abstract_keyword;

public class Test {
    public static void main(String[] args) {
        
        MobileUser mu; //refernce variable
        
        mu = new Rahim();
        mu.sendMessage();
        mu.call();
        
        mu = new Karim();
        mu.sendMessage();
        mu.call();
    }
}
