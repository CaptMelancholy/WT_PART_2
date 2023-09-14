package LABA_1.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class task3Test {

    @Test
    void solve() {
        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> result = task3.solve(2, 5, 2);
        arrayList.add(Math.tan(2));
        arrayList.add(Math.tan(4));
        arrayList.add(Math.tan(5));
        assertTrue(arrayList.equals(result));

    }
}