package LABA_1.task5;

public class Task5 {
    public static double solve(double[] array)
    {
        double temp = array[0];
        double result = 0;
        for(int i = 1; i < array.length; i++) {
            if(temp <= array[i]) {
                temp = array[i];
            } else {
                result++;
            }
        }
        return result;
    }
}
