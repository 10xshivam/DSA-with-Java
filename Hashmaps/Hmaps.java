package Hashmaps;

import java.util.*;

public class Hmaps {
    public static void main(String[] args) {
        // country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion - unordered hote hai
        map.put("India", 12);
        map.put("China", 34);
        map.put("US", 45);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        // Search - koi value exist krti hai ya nhi
        if (map.containsKey("Italy")) {
            System.out.println("Present in the map");
        } else {
            System.out.println("Not Present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Italy")); 

        // Iterate 
        // for(int e:arr)
        for(Map.Entry<String,Integer> e:map.entrySet()){ //e has key value pairs
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key + " " + map.get(key));
        }

        //REMOVE
        map.remove("China");
        System.out.println(map);

        // get the size
        System.out.println(map.size());
    }
}
