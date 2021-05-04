
/*
Java program to iterate through all elements in an array list using  Iterator.

 */


import java.util.ArrayList;
import java.util.*;

public class IterateArrayWithIterator_Q5 {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<String>();//create arraylist object
        aList.add ("Sunday");
        aList.add ("Monday");// add value to list
        aList.add ("Tuesday");
        aList.add ("Wenesday");
        aList.add ("Thursday");
        aList.add ("Friday");
        aList.add ("Saturday");
        Iterator i = aList.iterator();// iterate
        System.out.println("The ArrayList elements are: ");
        while (i.hasNext()){// while loop
            System.out.println(i.next());// print the list with iterator
        }

    }


}
