package me.fsite.learnjava.snake.core;

import java.util.ArrayList;

/**
 * Created by host1812 on 5/22/16.
 */
public class Logic {
    SnakeHead player;
    ArrayList<GameObject> list;

    public Logic() {
        GameObject w1 = new Wall(5, 5);
        list = new ArrayList<>();
        list.add(w1);

        player = new SnakeHead(10, 10);
        list.add(player);
    }

    public void processRightKey() {
        player.setX(player.getX() + 1);
    }

    public ArrayList<GameObject> getObjectsList() {
        return list;
    }

}
