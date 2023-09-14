package LABA_1.task8;

import java.util.ArrayList;

public class task8 {

    public static ArrayList<Integer> solve(double[] arr1, double[] arr2)
    {
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i != arr1.length)
        {
            if(arr1[i] <= arr2[j])
            {
                res.add(i);
                j++;
            } else {
                i++;
            }
        }
        int n = arr1.length;
        for(int k = j; j < arr2.length; j++)
        {
            res.add(n);
            n++;
        }
        return res;
    }
}
