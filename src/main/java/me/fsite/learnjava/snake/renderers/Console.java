package me.fsite.learnjava.snake.renderers;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import me.fsite.learnjava.snake.core.GameObject;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by host1812 on 5/22/16.
 */
public class Console {
    private Terminal terminal;

    public Console() {
        try {
            terminal = new DefaultTerminalFactory().createTerminal();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void render(ArrayList<GameObject> objectsList) {
        try {
            terminal.clearScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = objectsList.size(); i > 0; i--) {
            GameObject o = objectsList.get(i);
            try {
                terminal.setCursorPosition(o.getX(), o.getY());
                terminal.putCharacter(o.getC());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
