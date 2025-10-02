package HASHING;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 100; i++) {
            map.put("China" + i, 5 + i);

        }
        // getting key value pair
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);
        }
        // iterating an array
        int arr[] = { 1, 2, 3, 4 };
        System.out.println("elements are");
        for (int i : arr) {

            System.out.println(i);
        }

    }

}
