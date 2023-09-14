package LABA_1.task3;

import java.sql.Array;
import java.util.ArrayList;

public class task3 {
    public static ArrayList<Double> solve(int a, int b, int h) {
        ArrayList<Double> res = new ArrayList<>();
        if((h < 0 && (a < b)) || (h > 0 && a > b) || (h == 0) || (a == b))
        {
            res.add(Math.tan(a));
            res.add(Math.tan(b));
            return res;
        } else
        {
            if(a < b)
            {
                while(a < b)
                {
                  res.add(Math.tan(a));
                  a += h;
                }
                res.add(Math.tan(b));
            } else {
                while (a > b) {
                    res.add(Math.tan(a));
                    a -= h;
                }
                res.add(Math.tan(b));
            }
        }
        return res;
    }
}
