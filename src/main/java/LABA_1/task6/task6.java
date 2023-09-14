package LABA_1.task6;

public class task6 {
    public static double[][] solve(double[] arr) {
        double[][] res = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[i][(j + arr.length - i) % arr.length] = arr[j];
            }
        }
        return res;
    }
}
