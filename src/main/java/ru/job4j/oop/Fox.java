package ru.job4j.oop;

public class Fox {

    private final Ball ball;

    public Fox(Ball ball) {
        this.ball = ball;
    }

    public void tryEat() {
        ball.tryRun(true);
    }

}
