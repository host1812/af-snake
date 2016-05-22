package me.fsite.learnjava.snake.core;

/**
 * Created by host1812 on 5/22/16.
 */
public abstract class GameObject {
    private Integer x;
    private Integer y;
    private Character c;

    public GameObject() {
        this(0, 0, 'X');
    }

    public GameObject(Integer x, Integer y, Character c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }
}
