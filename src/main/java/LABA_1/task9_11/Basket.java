package LABA_1.task9_11;

import java.util.ArrayList;

public class Basket {

    public static ArrayList<Ball> balls;
    public Basket(ArrayList<Ball> balls){
        Basket.balls = balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public double countWeight() {
        double weight = 0;
        for(Ball ball : balls) {
            weight += ball.weight;
        }
        return weight;
    }

    public static int countColorBalls(String searchColor) {
        int amount = 0;
        for(Ball ball : balls) {
            if(ball.color.trim().equalsIgnoreCase(searchColor.trim())) {
                amount++;
            }
        }
        return amount;
    }
}
