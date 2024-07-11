package m072024;

import java.util.Stack;


/*You are given a string s that consists of lower case English letters and brackets.
 Reverse the strings in each pair of matching parentheses, starting from the innermost one.
 Your result should not contain any brackets.*/
public class Day10 {

    /* Straightforward Way*/
    public static String reverseParentheses_1(String s) {
        Stack<Integer> openParenthesesIndices = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(') {
                openParenthesesIndices.push(result.length()); /*Unknown*/
            } else if (currentChar == ')') {
                int start = openParenthesesIndices.pop();
                reverse(result, start, result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void reverse(StringBuilder sb, int start, int end) { /*Unknown*/
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

    /*Wormhole Teleportation technique*/
    public static String reverseParentheses_2(String s) {
        Stack<Integer> openParenthesesIndices = new Stack<>();
        int[] pair = new int[s.length()];

        // First pass: Pair up parentheses
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openParenthesesIndices.push(i);
            }
            if (s.charAt(i) == ')') {
                int j = openParenthesesIndices.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        // Second pass: Build the result string
        StringBuilder result = new StringBuilder();
        for (
                int currIndex = 0, direction = 1;
                currIndex < s.length();
                currIndex += direction
        ) {
            if (s.charAt(currIndex) == '(' || s.charAt(currIndex) == ')') {
                currIndex = pair[currIndex];
                direction = -direction;
            } else {
                result.append(s.charAt(currIndex));
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcef");
        System.out.println(s);
        reverse(s, 0, 4);
        System.out.println(s);
    }

}
