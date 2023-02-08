package main;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private float xDir = 1f, yDir = 1f;
    private int frames = 0;
    private long lastCheck = 0;
    private Color color = new Color(248, 178, 31);
    private Random random;


    public GamePanel (){
        random = new Random();
        setPanelSize();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void changeXDelta(int value){
        this.xDelta += value;

    }

    public void changeYDelta(int value){
        this.yDelta += value;

    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;

    }

    //Вызывает repaint() и перерисовывает изменения после ввода.
    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }


    private Color getRndColor(){
        int r = random.nextInt(255);
        int b = random.nextInt(255);;
        int g = random.nextInt(255);;

        return new Color(r,b,g);
    }
}
