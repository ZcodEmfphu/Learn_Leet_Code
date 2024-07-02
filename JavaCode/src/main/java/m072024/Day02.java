package m072024;

import java.util.ArrayList;
import java.util.List;

public class Day02 {
    /* Given two integer arrays nums1 and nums2, return an array of their intersection.
       Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.*/

    // Intersection : phần hợp

    public static int[] intersect(int[] arr1, int[] arr2) {
        List<Integer> arr = new ArrayList<>();

        boolean[] used = new boolean[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr.add(arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }


        return res;
    }

}
