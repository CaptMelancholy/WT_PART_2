package LABA_1.task9_11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    static ArrayList<Ball> testBalls = new ArrayList<>();
    static Basket basket;
    @BeforeAll
    static void init() {
        testBalls.add(new Ball("Blue", 2.0));
        testBalls.add(new Ball("Blue", 3.0));
        testBalls.add(new Ball("Red", 2.2));
        testBalls.add(new Ball("Yellow", 2.5));
        testBalls.add(new Ball("Green", 4.9));
        testBalls.add(new Ball("Orange", 1.0));
        testBalls.add(new Ball("Orange", 1.2));
        testBalls.add(new Ball("Blue", 0.5));
        basket = new Basket(testBalls);
    }
    @Test
    void countWeight() {
        assertEquals(basket.countWeight(), 17.3);
    }

    @Test
    void countColorBalls() {
        assertEquals(basket.countColorBalls("Blue"), 3);
    }
}