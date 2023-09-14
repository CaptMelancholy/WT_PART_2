package LABA_1.task9_11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<>());
        basket.addBall(new Ball("Blue", 2.9));
        basket.addBall(new Ball("Red", 1.2));
        basket.addBall(new Ball("Grey", 4.4));
        System.out.println(basket.countWeight());
        System.out.println(basket.countColorBalls("Grey"));
    }
}
