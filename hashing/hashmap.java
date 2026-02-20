// package hashing;

import java.util.*;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // insert -0(1)
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        System.out.println(hm);

        // get -0(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonisia"));

        // Contains 0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonisia"));

        // remove -0(1)
        System.out.println(hm.remove("china"));
        System.out.println(hm);
        System.out.println(hm.remove("indonesia"));
        System.out.println(hm);
        // size
        System.out.println(hm.size());
        // isEmpty
        System.out.println(hm.isEmpty());
        // clear
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());

    }

}
