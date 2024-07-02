package m072024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day02Test {

    @Test
    public void test(){
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2};
        int[] expected = {2};

        int[] result = Day02.intersect(arr1, arr2);
        Assertions.assertArrayEquals(expected, result);
    }

}