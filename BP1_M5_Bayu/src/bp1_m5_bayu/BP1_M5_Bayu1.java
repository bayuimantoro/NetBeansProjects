/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp1_m5_bayu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class BP1_M5_Bayu1 extends JPanel {
    private static final int L = 400, T = 400; // Ukuran layar
    private List<Mobil> mobil;

    public BP1_M5_Bayu1() {
        setBackground(Color.BLACK);
        setLayout(null);
        mobil = new ArrayList<>();
        mobil.add(new Mobil(0, 200)); // Posisi awal mobil

        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Mobil m : mobil) {
                    m.Bergerak();
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Mobil m : mobil) {
            m.GambarMobil(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    private static class Mobil {
        private static final int INCREMENT = 4; // Kecepatan mobil (pastikan kelipatan dari L)
        private int x, y;

        public Mobil(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void GambarMobil(Graphics g) {
            g.setColor(Color.BLUE); // Atap mobil
            g.fillRect(x + 15, y - 20, 60, 35); // Atap mobil
            g.setColor(Color.YELLOW); // Badan mobil
            g.fillRect(x, y, 110, 30); // Badan mobil
            g.setColor(Color.RED); // Roda
            g.fillOval(x + 15, y + 20, 20, 20); // Roda depan
            g.fillOval(x + 60, y + 20, 20, 20); // Roda belakang
        }

        public void Bergerak() {
            if (x == L) { 
                x = -110; // Reset ke luar layar kiri
            } else {
                x += INCREMENT; // Bergerak ke kanan
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Animasi Mobil Bergerak");
                frame.getContentPane().add(new BP1_M5_Bayu1());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
