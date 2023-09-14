package LABA_1.task4;

import java.math.BigInteger;
import java.util.ArrayList;

public class Task4 {
    public static ArrayList<Integer> solve(BigInteger[] arr)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isProbablePrime(1)) {
                res.add(i);
            }
        }
        return res;
    }
}
