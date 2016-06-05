package hello;

/************************************************************
 * MovingBall.java
 * 
 * ���� �����̴� �ִϸ��̼� ���ø�
 ************************************************************/

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/** 
 * ���� �����̴� �ִϸ��̼��� �����ϱ� ���� MovingBall Ŭ����.
 * �Ķ��� ���� ������ܿ��� �����ϴ����� �������ٰ�
 * �ٽ� ����������� �̵���Ű�� ���α׷��̴�.
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
