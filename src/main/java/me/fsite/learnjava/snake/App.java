package me.fsite.learnjava.snake;

import me.fsite.learnjava.snake.core.GameObject;
import me.fsite.learnjava.snake.core.GameState;
import me.fsite.learnjava.snake.core.Wall;
import me.fsite.learnjava.snake.renderers.Console;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        GameState state = GameState.PLAYING;
        Console c = new Console();
        GameObject w1 = new Wall(5, 5);
        ArrayList<GameObject> list = new ArrayList<>();

        while (state == GameState.PLAYING) {
            c.render(list);
        }

        System.out.println("Game end!");
    }
}
