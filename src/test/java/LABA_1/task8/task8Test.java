package LABA_1.task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class task8Test {

    @Test
    void solve() {
        double[] a = {1.0, 3.0, 5.0, 7.0};
        double[] b = {0.0, 2.0, 2.5, 4.0, 8.0};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = task8.solve(a, b);
        for(int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i));
        }
        System.out.println();
    }
}