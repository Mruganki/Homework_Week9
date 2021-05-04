
//Write a Java program to test an array list is empty or not. Define array list with  underground tube names


import java.util.ArrayList;
import java.util.List;

public class EmptyArray_Q7 {

    public static void main(String[] args) {

        // Create a list and add some colours to the list
        ArrayList<String> list_String = new ArrayList<String>();// default object created
        list_String.add("Bakerloo");
        list_String.add("Northenline");
        list_String.add("Piccadely");
        list_String.add("Silverline");// all array are underground tube name
        list_String.add("DLR");
        list_String.add("Centralline");
        list_String.add("Hammersimth");
        list_String.add("Jubilee");
        list_String.clear(    );// use word clear to result list empty
         if(list_String.isEmpty()){
             System.out.println("Its Empty");
         }else
             System.out.println("Not Empty");

    }
}
