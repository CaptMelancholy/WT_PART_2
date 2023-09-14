package LABA_1.task7;

public class Task7 {
    public static double[] solveShellSort(double[] array) {
        for(int i = 0; i < array.length - 1; ) {
            if(array[i] > array[i + 1]) {
                double tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if(i != 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return array;
    }
}
