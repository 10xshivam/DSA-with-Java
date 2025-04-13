package Hashmaps;
import java.util.HashSet;
import java.util.Iterator;

public class Hsets {
    public static void main(String[] args) {
        // It doesnt guarantee order
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        
        // Size;
        System.out.println(set.size());

        // Print all elements
        System.out.println(set);

        // Search
        if (set.contains(1)) {
            System.out.println("Present in the set");
        } 
        
        // Delete
        set.remove(4);
        if (!set.contains(4)) {
            System.out.println("Delete");
        } 

        // Iterator
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
    }
}
