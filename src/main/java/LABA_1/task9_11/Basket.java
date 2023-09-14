package LABA_1.task9_11;

import java.util.ArrayList;

public class Basket {

    public ArrayList<Ball> balls;
    public Basket(ArrayList<Ball> balls){
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int countWeight() {
        int weight = 0;
        for(Ball ball : balls) {
            weight += ball.weight;
        }
        return weight;
    }
}
