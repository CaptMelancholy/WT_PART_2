package LABA_1.task4;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class task4Test {

    @Test
    void solve() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(4);
        BigInteger[] arr = {BigInteger.valueOf(2), BigInteger.valueOf(4), BigInteger.valueOf(5), BigInteger.valueOf(8), BigInteger.valueOf(13)};
        ArrayList<Integer> arrayListRes = task4.solve(arr);
        assertTrue(arrayList.equals(arrayListRes));
    }
}