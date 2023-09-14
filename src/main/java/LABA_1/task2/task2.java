package LABA_1.task2;

public class task2 {
    public static boolean solve(float x, float y)
    {
        if((x > 6 || x < -6) || (y > 5 || y < -3)) return false;
        if(y > 0) {
            if (x >= -4 && x <= 4)
            {
                return true;
            }
            return false;
        }
        else if (y < 0) {
            if(x >= -6 && x <= 6)
            {
                return true;
            }
            return false;
        }
        else if(y == 0){
            return true;
        }
        return false;
    }
}
