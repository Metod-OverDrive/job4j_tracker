package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf(ball);
        Hare hare = new Hare(ball);
        Fox fox = new Fox(ball);
        
        wolf.tryEat();
        hare.tryEat();
        fox.tryEat();
    }
}
