package m072024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day09Test {

    @Test
    public void minOperationCounter() {
        String[] logs1 = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs2 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        String[] logs3 = {"d1/", "../", "../", "../"};
        Assertions.assertEquals(2, Day09.minOperationsCounter(logs1));
        Assertions.assertEquals(3, Day09.minOperationsCounter(logs2));
        Assertions.assertEquals(0, Day09.minOperationsCounter(logs3));
    }

    @Test
    public void minOperationStack() {
        String[] logs1 = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs2 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        String[] logs3 = {"d1/", "../", "../", "../"};
        Assertions.assertEquals(2, Day09.minOperationStack(logs1));
        Assertions.assertEquals(3, Day09.minOperationStack(logs2));
        Assertions.assertEquals(0, Day09.minOperationStack(logs3));
    }

}