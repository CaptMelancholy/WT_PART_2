package LABA_1.task5;

public class task5 {
    public static double solve(double[] arr)
    {
        double temp = arr[0];
        double res = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(temp <= arr[i])
            {
                temp = arr[i];
            } else {
                res++;
            }
        }
        return res;
    }
}
