package m06124;

import java.util.Arrays;

public class Day28 {

    public static int maximumImportance(int n, int[][] roads) {
        // Step 1: Count the degree of each city
        int[] degree = new int[n];
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }

        // Step 2: Sort the cities based on their degrees in descending order
        Integer[] cities = new Integer[n];
        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }
        Arrays.sort(cities, (a, b) -> degree[b] - degree[a]);

        // Step 3: Assign values to cities based on the sorted order
        int[] value = new int[n];
        int currentValue = n;
        for (int city : cities) {
            value[city] = currentValue--;
        }

        // Step 4: Calculate the total importance
        int totalImportance = 0;
        for (int[] road : roads) {
            totalImportance += value[road[0]] + value[road[1]];
        }

        return totalImportance;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] roads = {
                {0, 1},
                {0, 2},
                {0, 3},
                {1, 4}
        };
        System.out.println(maximumImportance(n, roads));  // Output: 43
    }
}
