package m072024;

import java.util.Stack;


/*You are given a string s that consists of lower case English letters and brackets.
 Reverse the strings in each pair of matching parentheses, starting from the innermost one.
 Your result should not contain any brackets.*/
public class Day10 {

    /* Straightforward Way*/
    public static String reverseParentheses(String s) {
        Stack<Integer> openParenthesesIndices = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(') {
                openParenthesesIndices.push(result.length());
            } else if (currentChar == ')') {
                int start = openParenthesesIndices.pop();
                reverse(result, start, result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

}
