package day05.innerClass.ex06.basic;

public class Hamburger {
    private int bun;
    private int patty;

    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public Hamburger(int bun, int patty, int cheese, int lettuce, int tomato, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    public Hamburger(int tomato, int lettuce, int cheese, int patty, int bun) {
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.cheese = cheese;
        this.patty = patty;
        this.bun = bun;
    }

    public Hamburger(int bun, int patty, int cheese) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
    }
}
