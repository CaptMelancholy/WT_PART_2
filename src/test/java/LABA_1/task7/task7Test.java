package LABA_1.task7;

import LABA_1.task7.task7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task7Test {

    @Test
    void solveShellSort() {
        double[] array = new double[]{4, 3, 7, 1, 9};
        double[] array2 = new double[]{1, 3, 4, 7, 9};
        task7.solveShellSort(array);
        assertArrayEquals(array, array2);
    }
}