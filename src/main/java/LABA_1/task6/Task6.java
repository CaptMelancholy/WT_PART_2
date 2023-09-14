package LABA_1.task6;

public class Task6 {
    public static double[][] solve(double[] array) {
        double[][] result = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][(j + array.length - i) % array.length] = array[j];
            }
        }
        return result;
    }
}
