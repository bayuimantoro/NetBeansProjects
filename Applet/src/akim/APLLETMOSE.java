/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akim;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class APLLETMOSE extends Applet implements MouseMotionListener {
    int mouseX = 0;
    int mouseY = 0;
    String message = "";

    public void init() {
        // Daftarkan listener mouse motion
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent me) {
        // Update posisi mouse saat bergerak
        mouseX = me.getX();
        mouseY = me.getY();
        message = "Mouse di (" + mouseX + ", " + mouseY + ")";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        // Tidak ada aksi untuk mouse dragged
    }

    public void paint(Graphics g) {
        // Gambar posisi mouse
        g.drawString(message, mouseX, mouseY);
    }
// TODO overwrite start(), stop() and destroy() methods
}
