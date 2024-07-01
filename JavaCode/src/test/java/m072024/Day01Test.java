package m072024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day01Test {

    @Test
    void threeConsecutiveOlds() {
        int[] arr = {2, 6, 4, 1};
        int[] arr1 = {1, 2, 34, 3, 4, 5, 7, 23, 12};

        Assertions.assertFalse(Day01.threeConsecutiveOlds(arr));
        Assertions.assertTrue(Day01.threeConsecutiveOlds(arr1));

        Assertions.assertFalse(Day01.threeConsecutiveOlds1(arr));
        Assertions.assertTrue(Day01.threeConsecutiveOlds1(arr1));
    }
}