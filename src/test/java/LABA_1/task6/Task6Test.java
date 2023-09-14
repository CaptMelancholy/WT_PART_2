package LABA_1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void solve() {
        double[] arr = new double[]{1, 2, 3, 4, 5};
        double[][] arr2 = new double[][]{{1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}};
        assertArrayEquals(Task6.solve(arr), arr2);
    }
}