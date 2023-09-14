package LABA_1.task2;

public class Task2 {
    public static boolean solve(float x, float y)
    {
        if(((x > 6) || (x < -6)) || ((y > 5) || (y < -3)))
        {
            return false;
        }
        if(y > 0) {
            return (x >= -4) && (x <= 4);
        } else if (y < 0) {
            return (x >= -6) && (x <= 6);
        } else if(y == 0){
            return true;
        }
        return false;
    }
}
