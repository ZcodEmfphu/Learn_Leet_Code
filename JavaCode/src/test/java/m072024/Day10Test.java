package m072024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day10Test {
    @Test
    public void reverseParentheses() {
        String s1 = "(abcd)";
        Assertions.assertEquals("dcba", Day10.reverseParentheses(s1));
    }

}