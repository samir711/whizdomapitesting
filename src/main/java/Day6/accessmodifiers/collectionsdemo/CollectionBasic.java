package Day6.accessmodifiers.collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionBasic {

    public static void main(String[] args) {

    /*
    ArrayList<String> courses = new ArrayList<String>();
    courses.add("Machine Element Design1");
    courses.add("Machine Element Design2");
    courses.add("Machine Element Design3");
    courses.add("Machine Element Design4");

    for(String s: courses){
    System.out.println(s);
    }
    */

    HashMap<String, String> map = new HashMap<String, String>();
    map.put("firstName","Alex");
    map.put("lastName","Thomas");
    map.put("email","Alex@12.com");
    map.put("Programme","Java");

    for(Map.Entry m: map.entrySet()){
        System.out.println(m.getKey() +" "+ m.getValue());
    }


    }
}
