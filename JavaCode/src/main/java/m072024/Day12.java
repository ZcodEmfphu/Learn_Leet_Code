package m072024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Day12 {

    /*Sorting & Stack*/
    public List<Integer> survivedRobotsHealths(int[] position, int[] health, String directions) {
        int n = position.length;
        Integer[] indices = new Integer[n];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (lhs, rhs) -> Integer.compare(position[lhs], position[rhs]));

        for(int currentIndex: indices){

        }

        return result;
    }


    public static void main(String[] args) {

    }
}
