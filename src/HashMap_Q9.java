/*
 HashMap object called people that will store String keys and Integer values:
  And use for each loop to iterate the value from Map.

 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_Q9 {
    public static void main(String[] args) {// main method
        Map<String, Integer> people = new HashMap<String, Integer>();//HashMap object called

        people.put ("English",10);// use put keyword to add value n key to the  list
        people.put ("India",20);
        people.put ("USA",30);
        people.put ("Russia",40);
        people.put ("Japan",50);
        people.put ("Austrlia",60);
        people.put ("China",70);
        people.put ("Europe",80);
        people.put ("Canada",90);

        for (Integer a: people.values()) {// foreach loop to fetch value from the list
            System.out.println(a);
        }

    }
}
