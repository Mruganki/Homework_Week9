/*
Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.

 */


import java.util.ArrayList;
import java.util.List;

public class CoulourList_Q4 {



    public static void main(String[] args) {

        // Create a list and add some colours to the list
        List<String>list_String = new ArrayList<String>();// default object created
        list_String.add("Red");
        list_String.add("Green");
        list_String.add("Orange");
        list_String.add("White");
        list_String.add("Black");
        // print the list
        for (String element :list_String) {
            System.out.println(element);

        }


    }

}
