package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
// Create an array list.
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " +
                al.size());
// Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " +
                al.size());
// Display the array list.
        System.out.println("Contents of al: " + al);


        // iterate
       Iterator itr = al.iterator();
        while(itr.hasNext()) {
            String element = (String) itr.next();
            System.out.print(element );
        }





        for(String v : al)
            System.out.print("for each value"+v + " ");




     //
    String item0= al.get(0)   ;
        System.out.println("item0="+item0);


// Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " +
                al.size());
        System.out.println("Contents of al: " + al);
}
}
