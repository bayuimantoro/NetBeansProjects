/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dika;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class BP1_M2_P1_DIKA extends Applet implements MouseMotionListener {
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
