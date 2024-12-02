/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package BP1_M1_P1_Bayu;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePositionApplet extends Applet implements MouseMotionListener {
    private int x = 0;
    private int y = 0;

    @Override
    public void init() {
        addMouseMotionListener(this); 
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Mouse position: (" + x + ", " + y + ")", x, y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }
}
