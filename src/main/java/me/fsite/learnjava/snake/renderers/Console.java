package me.fsite.learnjava.snake.renderers;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import me.fsite.learnjava.snake.core.GameObject;
import me.fsite.learnjava.snake.core.Logic;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by host1812 on 5/22/16.
 */
public class Console {
    private Terminal terminal;
    private Screen s;
    private Logic l;

    public Console(Logic l) {
        this.l = l;
        try {
            terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(50, 20)).createTerminal();
            terminal.setCursorVisible(false);
            s = new TerminalScreen(terminal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void render() {
        try {
            KeyStroke ks = terminal.pollInput();
            if (ks != null) {
                switch (ks.getKeyType()) {
                    case ArrowDown:
                        terminal.putCharacter('D');
                        break;

                    case ArrowUp:
                        terminal.putCharacter('U');
                        break;

                    case ArrowLeft:
                        terminal.putCharacter('L');
                        break;

                    case ArrowRight:
                        l.processRightKey();
                        break;

                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<GameObject> objectsList = l.getObjectsList();
        try {
            s.clear();
            s.startScreen();
            s.setCursorPosition(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = objectsList.size(); i > 0; i--) {
            GameObject o = objectsList.get(i - 1);

            s.setCharacter(o.getX(), o.getY(), new TextCharacter(o.getC()));
        }

        try {

            s.refresh(Screen.RefreshType.DELTA);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // In reality we do not need to redraw everything.
        // Only snake object need to be updated and food items to be flashed.
//        try {
//            terminal.clearScreen();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
