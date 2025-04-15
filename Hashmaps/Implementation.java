package Hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation {
    // Ye hashmap ka data structure hone wala hai,isse hashmap ka object bnayenge
    static class HashMap<K,V> {
        // LL ki node ko define kr rha hai
        private class Node {
            K key;
            V value; 

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total no. of nodes
        private int N; // total no. of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked") // to remove the warning due to no type give to LL
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // initially it has stored null thats why we are creating a LL at all index, if LL doesn't we cannot store nodes in it
            }
        }

        private int hashFunction(K key){
            int bi = key.hashCode(); // return 234567  -234554
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i) == key) {
                    return i; // di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reshash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for (int i = 0; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i]; // har ek bucket pr ek LL hogi
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key); // to get the bucket number
            int di = searchInLL(key,bi); // to get the node index
            if (di == -1) { //key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0) {
                reshash();
            }
        }

        public V get(K key){
            int bi = hashFunction(key); // to get the bucket number
            int di = searchInLL(key,bi); // to get the node index
            if (di == -1) { //key doesn't exist
                return null;
            } else { // key exist
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key); // to get the bucket number
            int di = searchInLL(key,bi); // to get the node index
            if (di == -1) { //key doesn't exist
                return false;
            } else { // key exist
                return true;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key); // to get the bucket number
            int di = searchInLL(key,bi); // to get the node index
            if (di == -1) { //key doesn't exist
                return null;
            } else { // key exist
                Node node = buckets[bi].remove();
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0 ;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) { //bi
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 150);
        map.put("Japan", 180);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));

    }
}
