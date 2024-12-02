/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BP1_M1_P1_Bayu.tugas;

/**
 *
 * @author bayui
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BP1_M2_PostTest2_Bayu_Apllet3D extends Applet {
    @Override
    public void paint(Graphics g) {
        // Mengatur warna untuk garis kubus
        g.setColor(Color.RED);
        
        // Koordinat kubus
        int[][] points = {
            {50, 50},   // Titik 0
            {150, 50},  // Titik 1
            {150, 150}, // Titik 2
            {50, 150},  // Titik 3
            {80, 80},   // Titik 4 (Titik belakang)
            {180, 80},  // Titik 5 (Titik belakang)
            {180, 180}, // Titik 6 (Titik belakang)
            {80, 180}   // Titik 7 (Titik belakang)
        };

        // Menggambar garis kubus
        drawCube(g, points);
    }

    private void drawCube(Graphics g, int[][] points) {
        // Menggambar sisi depan
        g.drawLine(points[0][0], points[0][1], points[1][0], points[1][1]); // Garis 0-1
        g.drawLine(points[1][0], points[1][1], points[2][0], points[2][1]); // Garis 1-2
        g.drawLine(points[2][0], points[2][1], points[3][0], points[3][1]); // Garis 2-3
        g.drawLine(points[3][0], points[3][1], points[0][0], points[0][1]); // Garis 3-0

        // Menggambar sisi belakang
        g.drawLine(points[4][0], points[4][1], points[5][0], points[5][1]); // Garis 4-5
        g.drawLine(points[5][0], points[5][1], points[6][0], points[6][1]); // Garis 5-6
        g.drawLine(points[6][0], points[6][1], points[7][0], points[7][1]); // Garis 6-7
        g.drawLine(points[7][0], points[7][1], points[4][0], points[4][1]); // Garis 7-4

        // Menghubungkan sisi depan dan belakang
        g.drawLine(points[0][0], points[0][1], points[4][0], points[4][1]); // Garis 0-4
        g.drawLine(points[1][0], points[1][1], points[5][0], points[5][1]); // Garis 1-5
        g.drawLine(points[2][0], points[2][1], points[6][0], points[6][1]); // Garis 2-6
        g.drawLine(points[3][0], points[3][1], points[7][0], points[7][1]); // Garis 3-7
    }
}
