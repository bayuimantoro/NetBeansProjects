/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akim;

import java.applet.Applet;
import java.awt.*;

public class BP1_M2_Tugas2_Nama_AppletAnimasi extends Applet implements Runnable {
    private int x, y, radius;
    private int dy;
    private Thread animator;
    private boolean running = false;

    public void init() {
        // Inisialisasi posisi dan arah gerak
        x = 100; // Posisi horizontal tetap
        y = 50;  // Posisi awal vertikal
        radius = 20;
        dy = 5;  // Kecepatan gerak vertikal

        // Mulai animasi
        startAnimation();
    }

    public void startAnimation() {
        if (animator == null || !running) {
            animator = new Thread(this);
            running = true;
            animator.start();
        }
    }

    public void stopAnimation() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            // Update posisi vertikal
            y += dy;

            // Pantulkan jika mencapai tepi atas atau bawah
            if (y < 0 || y > getHeight() - radius) {
                dy = -dy;
            }

            // Redraw lingkaran
            repaint();

            try {
                Thread.sleep(30); // Kecepatan animasi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        // Gambar latar belakang
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Gambar lingkaran
        g.setColor(Color.blue);
        g.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public void start() {
        startAnimation();
    }

    @Override
    public void stop() {
        stopAnimation();
    }
}