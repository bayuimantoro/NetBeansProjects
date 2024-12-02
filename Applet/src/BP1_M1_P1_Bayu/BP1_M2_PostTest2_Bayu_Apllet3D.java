/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package BP1_M1_P1_Bayu;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class BP1_M2_PostTest2_Bayu_Apllet3D extends Applet implements ActionListener {
    private int ballX = 0;         
    private int ballY = 100;        
    private int ballSize = 30;      
    private int direction = 1;      
    private int speed = 5;       
    private Timer timer;

    @Override
    public void init() {
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.GREEN);
        g.fillOval(ballX, ballY, ballSize, ballSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX += speed * direction;
        if (ballX >= getWidth() - ballSize || ballX <= 0) {
            direction *= -1;
        }
        repaint();
    }
}
