// You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:

// items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
// The value of each item in items is unique.
// Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.

// Note: ret should be returned in ascending order by value.

// Example 1:

// Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
// Output: [[1,6],[3,9],[4,5]]
// Explanation: 
// The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 5, total weight = 1 + 5 = 6.
// The item with value = 3 occurs in items1 with weight = 8 and in items2 with weight = 1, total weight = 8 + 1 = 9.
// The item with value = 4 occurs in items1 with weight = 5, total weight = 5.  
// Therefore, we return [[1,6],[3,9],[4,5]].

package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimilarMergeItem {
    public static void update(int[][] items, Map<Integer, Integer> map) {
        for (int item[] : items) {
            int val = item[0];
            int wt = item[1];
            map.put(val, map.getOrDefault(val, 0) + wt);
        }
    }

    public static void mergeSimilar(int[][] item1, int[][] item2) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        update(item1, map);
        update(item2, map);
        for (Integer val : map.keySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(val);
            temp.add(map.get(val));
            ans.add(temp);
        }
        System.out.println(ans.toString()); // Final Ans
    }

    public static void main(String[] args) {
        int item1[][] = new int[3][2];
        item1[0][0] = 1;
        item1[0][1] = 1;
        item1[1][0] = 4;
        item1[1][1] = 5;
        item1[2][0] = 3;
        item1[2][1] = 8;
        int item2[][] = new int[2][2];
        item2[0][0] = 3;
        item2[0][1] = 1;
        item2[1][0] = 1;
        item2[1][1] = 5;
        mergeSimilar(item1, item2);
        // System.out.println(Arrays.deepToString(item2));
    }

}
