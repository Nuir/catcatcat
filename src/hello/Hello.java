package hello;

/************************************************************
 * MovingBall.java
 * 
 * 공을 움직이는 애니메이션 애플릿
 ************************************************************/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/** 
 * 공을 움직이는 애니메이션을 수행하기 위한 MovingBall 클래스.
 * 파란색 공을 좌측상단에서 우측하단으로 움직였다가
 * 다시 좌측상단으로 이동시키는 프로그램이다.
 */
public class Hello extends JApplet 
{
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 200, HEIGHT = 200;
    private static final int STEPS = 180;
    private static final int DELAY = 10;
    private static final int SIZE = 20;
 
    public void init() 
    {
        resize(WIDTH, HEIGHT);
    }
    public void paint(Graphics g) 
    {
        int x = 0, y = 0;
        for (int i = 0; i < STEPS; ++i) {
            x++; y++;
            drawBall(g, x, y);
            sleep(DELAY);
        }
        for (int i = 0; i < STEPS; ++i) {
            x--; y--;
            drawBall(g, x, y);
            sleep(DELAY);
        }
    }
    private void sleep(int delay) 
    {
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void drawBall(Graphics g, int x, int y) 
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.blue);
        g.fillOval(x, y, 10, SIZE);
    }
}
