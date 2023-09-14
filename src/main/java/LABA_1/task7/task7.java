package LABA_1.task7;

public class task7 {
    public static double[] solveShellSort(double[] arr) {
        double[] res = arr;
        for(int i = 0; i < res.length - 1; )
        {
            if(res[i] > res[i + 1])
            {
                double tmp = res[i];
                res[i] = res[i + 1];
                res[i + 1] = tmp;
                if(i != 0) i--;
            } else if(i != res.length) i++;

        }
        return res;
    }
}
