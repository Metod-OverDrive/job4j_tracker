package ru.job4j.oop;

public class Wolf {

    private final Ball ball;

    public Wolf(Ball ball) {
        this.ball = ball;
    }

    public void tryEat() {
        ball.tryRun(false);
    }
}