
package linked_list;

import java.util.HashMap;


public class HashMapDemo {
    public static void main(String[] args) {
        //put, get
        HashMap <Integer, String> customer = new HashMap<Integer, String>();
        
        
        customer.put(101, "Jaid");
        customer.put(102, "Rasel");
        customer.put(103, "Nasir");
        customer.put(104, "Monir");
        customer.put(105, "Hasan");
        
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }
}
