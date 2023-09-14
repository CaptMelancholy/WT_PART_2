package LABA_1.task2;

import org.junit.jupiter.api.Test;
import LABA_1.task2.task2;

import static org.junit.jupiter.api.Assertions.*;

class task2Test {

    @Test
    void solve() {
        boolean res = task2.solve(0, 0);
        assertTrue(res);
        res = task2.solve(-3, -3);
        assertTrue(res);
        res = task2.solve(-6, -3);
        assertTrue(res);
        res = task2.solve(-7, -3);
        assertFalse(res);
    }
}