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

public class BP1_M5_PostTest_Bayu extends JPanel {
    private static final int L = 400, T = 400;
    private List<Bola> bola;

    public BP1_M5_PostTest_Bayu() {
        setBackground(Color.BLACK);
        setLayout(null);
        bola = new ArrayList<>();
        bola.add(new Bola(200, 0));

        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Bola b : bola) {
                    b.Bergerak();
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Bola b : bola) {
            b.GambarBola(g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(L, T);
    }

    private static class Bola {
        private static final int INCREMENT = 8; //kecepatan bola
        private int x, y;
        private static final int DIAMETER = 100; //ddiameter bola

        public Bola(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void GambarBola(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillOval(x, y, DIAMETER, DIAMETER);
        }

        public void Bergerak() {
            if (y >= T) { 
                y = -DIAMETER;
            } else {
                y += INCREMENT;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Animasi Bola Bergerak");
                frame.getContentPane().add(new BP1_M5_PostTest_Bayu());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
