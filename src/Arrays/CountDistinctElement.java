package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElement {

    // Method to count distinct elements
    static void countFreq(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Distinct Elements Count: " + mp.size());
    }

    public static void main(String[] args) {

        int arr[] = {10, 40, 50, 20, 10, 20, 30, 10};
        int n = arr.length;

        countFreq(arr, n);
    }
}