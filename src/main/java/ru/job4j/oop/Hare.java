package ru.job4j.oop;

public class Hare {

    private final Ball ball;

    public Hare(Ball ball) {
        this.ball = ball;
    }

    public void tryEat() {
        ball.tryRun(false);
    }

}
