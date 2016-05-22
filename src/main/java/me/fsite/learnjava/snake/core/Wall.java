package me.fsite.learnjava.snake.core;

/**
 * Created by host1812 on 5/22/16.
 */
public class Wall extends GameObject {
    public Wall() {
        this(0, 0);
    }

    public Wall(Integer x, Integer y) {
        super(x, y, 'X');
    }
}
