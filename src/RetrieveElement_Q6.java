
/*
Java program to retrieve an element (at a specified index) from a given array list

 */

import java.util.*;

public class RetrieveElement_Q6 {

    public static void main(String[] args) {

        List alist = new ArrayList();//The ArrayList aList is created. Then ArrayList.add() is used to add the elements to the ArrayList.
        alist.add("Leeds");
        alist.add("London");
        alist.add("Livepool");
        alist.add("Manchester");
        alist.add("Bristol");
        alist.add("Halifax");
        alist.add("Hull");
        alist.add("Ridding");
        alist.add("Shefield");
        System.out.println("The element at index 3 in the ArrayList is :"+ alist.get(3));
        // An element can be retrieved from the ArrayList in Java by using the java.util.ArrayList.get() method.
    }
}
