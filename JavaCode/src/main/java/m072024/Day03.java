package m072024;

public class Day03 {
    /*You are given an integer array nums.
    In one move, you can choose one element of nums and change it to any value.
    Return the minimum difference between the largest and smallest value of nums after performing at most three moves. */

    public static int minDifference(int[] nums) {
        int res = 0;

        if (nums.length <= 4) {
            return 0;
        }

        int[] min = new int[4];
        int[] max = new int[4];




        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4};
    }
}
