package LABA_1.task7;

public class Task7 {
    public static double[] solveShellSort(double[] array) {
        double[] result = array;
        for(int i = 0; i < result.length - 1; ) {
            if(result[i] > result[i + 1]) {
                double tmp = result[i];
                result[i] = result[i + 1];
                result[i + 1] = tmp;
                if(i != 0) i--;
            } else if(i != result.length) i++;

        }
        return result;
    }
}
