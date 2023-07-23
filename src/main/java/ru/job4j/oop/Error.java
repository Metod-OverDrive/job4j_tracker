package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status  = status;
        this.message = message;
    }

    public void send() {
        System.out.println(active + " Status " + status + " Message " + message);
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        Error err2 = new Error(false, 418, "I’m a teapot");
        err1.send();
        err2.send();
    }
}
