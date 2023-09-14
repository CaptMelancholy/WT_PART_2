package LABA_1.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void testSolveMethod() {
        double res = Task1.solve(0, 0);
        assertEquals(res, 0.5, 0.001);
        res = Task1.solve(1, 1);
        assertEquals(res, 1.9134, 0.001);
        res = Task1.solve(100, 142);
        assertEquals(res, 100.00989657, 0.0001);

    }
}