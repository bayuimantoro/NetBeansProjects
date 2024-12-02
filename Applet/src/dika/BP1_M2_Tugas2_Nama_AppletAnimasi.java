/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dika;

import java.applet.Applet;
import java.awt.*;

public class BP1_M2_Tugas2_Nama_AppletAnimasi extends Applet implements Runnable {
    int x = 10;  // Posisi awal lingkaran
    int y = 100;
    int diameter = 30;
    int dx = 2;  // Kecepatan bergerak horizontal

    Thread animator;

    public void init() {
        setSize(400, 200);
        setBackground(Color.pink);
    }

    public void start() {
        animator = new Thread(this);
        animator.start();
    }

    public void run() {
        while (true) {
            x += dx;

            // Pantulan ketika mencapai tepi
            if (x < 0 || x > getWidth() - diameter) {
                dx = -dx;
            }

            repaint();

            try {
                Thread.sleep(20);  // Kecepatan animasi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x, y, diameter, diameter);  // Menggambar lingkaran
    }

    public void stop() {
        animator = null;
    }
}