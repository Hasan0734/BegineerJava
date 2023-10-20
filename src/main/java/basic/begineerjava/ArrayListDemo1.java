package basic.begineerjava;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(0, 60);

        System.out.println(number);

//        
//        Iterator itr = number.iterator();
//        
//        while(itr.hasNext()){
//            System.out.print(" " + itr.next());
//        }
//        for(int x : number){
//            System.out.print(" " +x);
//        }
//
//        System.out.println("Size = " + number.size());
//        number.remove(2);
//        number.removeAll(number);
//        number.clear(number);
        System.out.println(number.isEmpty());
        System.out.println("After removing : " + number);

        boolean isExist = number.contains(30);
        System.out.println("30 is in the list : " + isExist);

        int index = number.indexOf(30);
        System.out.println("The index of 40 is : " + index);

//      replace item
        number.set(4, 70);
        System.out.println("After seting : " + number);
        
//      find index of item
        int x = number.get(0);
        System.out.println("Index 0 = " + x);
        
        
        
    }
}
