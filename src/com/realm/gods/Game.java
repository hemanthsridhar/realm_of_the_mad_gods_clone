package com.realm.gods;

import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable {

    public static int aspectedRatio = 16 * 9;
    public static int width = 300;
    public static int height = width / aspectedRatio;
    public static int scale = 3; //how much our game can be scaled upto. We need to make a retro game. So scale up the width and height by 3
    private Thread thread;
    private boolean running;
    private JFrame frame;

    public Game() {

    }

    public synchronized void start() {
        running = true;
        thread = new Thread(this, "Display");
        thread.start();
    }

    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (running) {

        }
    }
}
