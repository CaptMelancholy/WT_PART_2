package LABA_1.task5;

import LABA_1.task5.task5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

    @Test
    void solve() {
        double[] arr = {1, 0, 2, 3, 2, 3, 4, 5};
        assertEquals(task5.solve(arr), 2);
    }
}