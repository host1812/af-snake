package me.fsite.learnjava.snake.core;

/**
 * Created by host1812 on 5/22/16.
 */
public class SnakeHead extends GameObject {
    public SnakeHead() {
        this(0, 0);
    }

    public SnakeHead(Integer x, Integer y) {
        super(x, y, '@');
    }
}
