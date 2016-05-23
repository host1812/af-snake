package me.fsite.learnjava.snake;

import me.fsite.learnjava.snake.core.GameState;
import me.fsite.learnjava.snake.core.Logic;
import me.fsite.learnjava.snake.renderers.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        GameState state = GameState.PLAYING;
        Logic l = new Logic();
        Console c = new Console(l);

        while (state == GameState.PLAYING) {
            c.render();
        }

        System.out.println("Game end!");
    }
}
