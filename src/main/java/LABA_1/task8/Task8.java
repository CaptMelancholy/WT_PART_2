package LABA_1.task8;

import java.util.ArrayList;

public class Task8 {

    public static ArrayList<Integer> solve(double[] arrayReceiving, double[] arrGiving)
    {
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayResult = new ArrayList<>();
        while (i != arrayReceiving.length && j != arrGiving.length) {
            if(arrayReceiving[i] >= arrGiving[j])
            {
                arrayResult.add(i);
                j++;
            } else {
                i++;
            }
        }
        int n = arrayReceiving.length;
        for(; j < arrGiving.length; j++)
        {
            arrayResult.add(n);
            n++;
        }
        return arrayResult;
    }
}
