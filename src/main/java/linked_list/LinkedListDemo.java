
package linked_list;

import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<String>();
        
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Nepal");
        countries.add("Iran");
        countries.add(3, "Brazil");
        countries.addFirst("Afganisthan");
        countries.addLast("Palintaiin");
        
        countries.remove("Iran");
        countries.remove(4);
        
        
        System.out.println(countries);
        
        
        for(String country : countries){
            System.out.println(country);
        }
        
        System.out.println("Size of the likedlist : " +countries.size());
        
    }
}
