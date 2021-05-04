
/*
Java program to reverse an array of integer values.

 */

import java.util.Arrays;// calling util package to call arrays class
import java.util.Collections;// calling util package to call collection class



public class ReverseArray_Q3 {

    // function reverse the element of the Array
    static void reverse(Integer myArray[]){ // static method with int array parameters
        Collections.reverse(Arrays.asList(myArray));// reverse the order of the elements in the list of array
        System.out.println("Reversed Array: "+Arrays.asList(myArray));
    }

    public static void main(String[] args) {

        Integer []myArray = {11,22,33,44,55,66,77,88,99};// define array
        System.out.println("Original Array: "+Arrays.asList(myArray));
        reverse(myArray);
    }


}

